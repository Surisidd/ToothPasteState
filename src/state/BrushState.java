package state;

public class BrushState implements State {
	ToothPaste toothPaste;
	public BrushState(ToothPaste toothPaste) {
		this.toothPaste = toothPaste;
	}

	@Override
	public void applyBrush() {
		System.out.println("Apply toothpaste to brush");
		toothPaste.setState(toothPaste.getPlagueState());
	}

	@Override
	public void removePlague() {
		System.out.println("Removing Plague not ready");
		
	}

	@Override
	public void removeTar() {
		System.out.println("Removing tar not ready");

	}

	@Override
	public void relieveSensitivity() {
		System.out.println("Relieve Sensitivity not ready yet");

	}

	@Override
	public void cleanTeeth() {
		System.out.println("Cleaning teeth not ready");

	}

	@Override
	public void polishTeeth() {
		System.out.println("Polishing not ready yet");

	}
	public String toString() {
		return " brush state";
	}
}
