package de.gothaer;

public class Demo {

	public static void main(String[] args) {
		new Demo().run();

	}

	private void run() {
		MyCollection col = new MyCollection(this::tueWasMitWert);
		
		for (int i = 0; i < 6; i++) {
			System.out.println(col.getActualValue());
			col.next();
		}
	}
	
	void tueWasMitWert(int wert) {
		
	}

}
