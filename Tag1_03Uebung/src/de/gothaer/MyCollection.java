package de.gothaer;

public class MyCollection {
	
	
	private final int [] feld = { 10, 20, 30,40 };
	private int index = 0;
	
	public MyCollection(/* Funktionszeiger */) {
		
	}
	
	public int getActualValue() {
		return feld[index];
	}

	
	public void next() {
		index ++;
		index %= feld.length;
		// Hier die Funktion ausführen. Funktion bekommt den JETZT aktuellen Wert übergeben.
	}
}
