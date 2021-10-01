package state;

public class PolishState implements State {
	ToothPaste toothPaste;
	public PolishState(ToothPaste toothPaste) {
		this.toothPaste = toothPaste;
	}

	@Override
	public void applyBrush() {
		System.out.println("Tooth Paste on brush");

	}

	@Override
	public void removePlague() {
		System.out.println("Plague removed");

	}

	@Override
	public void removeTar() {
		System.out.println("Tar removed");

	}

	@Override
	public void relieveSensitivity() {
		System.out.println("Sensitivity eased");

	}

	@Override
	public void cleanTeeth() {
		System.out.println("Teeth cleaned");

	}

	@Override
	public void polishTeeth() {
		System.out.println("Polishing Teeth");
	}
	public String toString() {
		return " polishing teeth state";
	}

}
