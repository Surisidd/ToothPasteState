package state;

public class SensitivityState implements State {
	ToothPaste toothPaste;
	public SensitivityState(ToothPaste toothPaste) {
		this.toothPaste = toothPaste;
	}

	@Override
	public void applyBrush() {
		System.out.println("ToothPaste already on brush");

	}

	@Override
	public void removePlague() {
		System.out.println("Plague alredy removed");

	}

	@Override
	public void removeTar() {
		System.out.println("Tar already Removed");

	}

	@Override
	public void relieveSensitivity() {
		System.out.println("Relieving Sensitivity");
		toothPaste.setState(toothPaste.getCleanState());

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
		return " sensitivity state";
	}
}
