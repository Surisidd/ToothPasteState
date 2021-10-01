package state;

public class ToothPaste {
	State brushState;
	State cleanState;
	State plagueState;
	State tarState;
	State sensitivityState;
	State polishState;
	
	State state;
	public ToothPaste() {
		brushState = new BrushState(this);
		cleanState = new CleaningState(this);
		plagueState = new PlagueState(this);
		tarState = new TarState(this);
		sensitivityState = new SensitivityState(this);
		polishState = new PolishState(this);
		
		state = brushState;
		
	}
	
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public State getBrushState() {
		return brushState;
	}
	public State getPlagueState() {
		return plagueState;
	}
	public State getTarState() {
		return tarState;
	}
	public State getPolishState() {
		return polishState;
	}
	public State getCleanState() {
		return cleanState;
	}
	public State getSensitivityState() {
		return sensitivityState;
	}
	public void applyBrush() {
		state.applyBrush();
	}
	public void cleanTeeth() {
		state.cleanTeeth();
	}
	public void polishTeeth() {
		state.polishTeeth();
	}
	public void relieveSensitivity() {
		state.relieveSensitivity();
	}
	public void removePlague() {
		state.removePlague();
	}
	public void removeTar() {
		state.removeTar();
	}
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n-----Mach Brushing Teeth--------\n");
		result.append("ToothPaste " + state + "\n");
		return result.toString();
	}


}
