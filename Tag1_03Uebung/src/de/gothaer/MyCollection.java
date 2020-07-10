package de.gothaer;

import java.util.function.Consumer;

public class MyCollection {
	
	
	private final int [] feld = { 10, 20, 30,40 };
	private int index = 0;
	
	private final Consumer<Integer> consumer;
	
	public MyCollection() {
		consumer = x->{};
	}
	
	public MyCollection(final Consumer<Integer> consumer) {
		this.consumer = consumer;
	}

	public int getActualValue() {
		return feld[index];
	}

	
	public void next() {
		index ++;
		index %= feld.length;
		consumer.accept(getActualValue());
	}
}
