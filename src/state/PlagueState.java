package state;

public class PlagueState implements State {
	ToothPaste toothPaste;
	public PlagueState(ToothPaste toothPaste) {
		this.toothPaste = toothPaste;
	}

	@Override
	public void applyBrush() {
		System.out.println("ToothPaste already applied to brush");

	}

	@Override
	public void removePlague() {
		System.out.println("Removing plague");
		toothPaste.setState(toothPaste.getTarState());
	}

	@Override
	public void removeTar() {
		System.out.println("Removing Tar not ready ");
		

	}

	@Override
	public void relieveSensitivity() {
		System.out.println("Sensitivity not ready ");
		
	}

	@Override
	public void cleanTeeth() {
		System.out.println("Cleaning not ready");

	}

	@Override
	public void polishTeeth() {
		System.out.println("Polishing not ready");

	}
	public String toString() {
		return " removing plague state";
	}

}
