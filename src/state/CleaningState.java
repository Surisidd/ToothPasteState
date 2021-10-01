package state;

public class CleaningState implements State {
	ToothPaste toothPaste;
	public CleaningState(ToothPaste toothPaste) {
		this.toothPaste = toothPaste;
	}

	@Override
	public void applyBrush() {
		System.out.println("Tooth Paste already on brush");

	}

	@Override
	public void removePlague() {
		System.out.println("Plague already removed");
	}

	@Override
	public void removeTar() {
		
		System.out.println("Tar already removed");
	}

	@Override
	public void relieveSensitivity() {
		System.out.println("Sensitivity already eased");

	}

	@Override
	public void cleanTeeth() {
		System.out.println("Cleaning teeth");
		toothPaste.setState(toothPaste.getPolishState());
	}

	@Override
	public void polishTeeth() {
		System.out.println("Polishing not ready");

	}
	public String toString() {
		return " cleaning teeth state";
	}

}
