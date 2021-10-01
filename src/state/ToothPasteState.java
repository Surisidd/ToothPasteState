package state;

public class ToothPasteState {

	public static void main(String[] args) {
		ToothPaste toothPaste = new ToothPaste();
		
		System.out.println(toothPaste);
		
		toothPaste.applyBrush();
		toothPaste.removePlague();
		toothPaste.removeTar();

		toothPaste.relieveSensitivity();
		toothPaste.cleanTeeth();
		toothPaste.polishTeeth();
		toothPaste.removeTar();
		
		
		
		System.out.println(toothPaste);
		
		
		toothPaste = new ToothPaste();
		
		System.out.println(toothPaste);
		
		toothPaste.applyBrush();
		
		toothPaste.polishTeeth();
		toothPaste.removeTar();
		toothPaste.relieveSensitivity();
		toothPaste.cleanTeeth();
		
		toothPaste.removePlague();
		toothPaste.removeTar();
		toothPaste.cleanTeeth();
		toothPaste.relieveSensitivity();
		toothPaste.cleanTeeth();


		
		
		System.out.println(toothPaste);
		
		

	}

}
