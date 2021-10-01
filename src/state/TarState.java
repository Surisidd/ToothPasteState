package state;

public class TarState implements State {
	ToothPaste toothPaste;
	public TarState(ToothPaste toothPaste) {
		this.toothPaste = toothPaste;
	}

	@Override
	public void applyBrush() {
		System.out.println("ToothPaste already on brush");

	}

	@Override
	public void removePlague() {
		System.out.println("Plague already removed");

	}

	@Override
	public void removeTar() {
		System.out.println("Removing Tar");
		toothPaste.setState(toothPaste.getSensitivityState());

	}

	@Override
	public void relieveSensitivity() {
		System.out.println("Sensitivity not relieved");

	}

	@Override
	public void cleanTeeth() {
		System.out.println("Teeth not cleaned");

	}

	@Override
	public void polishTeeth() {
		System.out.println("Polishing not done");

	}
	public String toString() {
		return " remove tar state";
	}

}
