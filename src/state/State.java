package state;

public interface State {
	public void applyBrush();
	public void removePlague();
	public void removeTar();
	public void relieveSensitivity();
	public void cleanTeeth();
	public void polishTeeth();
}
