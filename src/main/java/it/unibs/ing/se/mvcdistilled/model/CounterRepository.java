package it.unibs.ing.se.mvcdistilled.model;

public class CounterRepository {
	private static final Counter counter = new Counter();
	
	public Counter getCounter() {
		return counter;
	}
}
