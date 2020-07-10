package de.gothaer;

import java.util.Iterator;
import java.util.function.Consumer;

public class Demo {

	public static void main(String[] args) {
		new Demo().run();

	}

	private void run() {
		
		
		
		Consumer<Integer> c = v -> System.out.println(v * v);
		c = c.andThen(v -> System.out.println(v / 2));
		
		MyCollection col = new MyCollection(c);
		
		for (int i = 0; i < 6; i++) {
			System.out.println(col.getActualValue());
			col.next();
		}
	}
	
	void tueWasMitWert(int wert) {
		System.out.println("Hallo : " +  wert);
	}

}
