package it.unibs.ing.se.mvcdistilled.model;

public class Counter {
	private long value = 0;
	
	public Counter(long initialValue) {
		value = initialValue;
	}
	
	public Counter() {
		this(0);
	}


	public long getValue() {
		return value;
	}

	public void increment() {
		value++;
	}
}
