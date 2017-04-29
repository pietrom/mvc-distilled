package it.unibs.ing.se.mvcdistilled.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest {
	@Test
	public void initialCounterValueIsZero() throws Exception {
		Counter counter = new Counter();
		assertEquals(0, counter.getValue());
	}
	
	@Test
	public void canIncrementCounterValue() throws Exception {
		Counter counter = new Counter();
		counter.increment();
		assertEquals(1, counter.getValue());
	}
	
	@Test
	public void canProvideInitialValue() throws Exception {
		final long initialValue = 19;
		Counter counter = new Counter(initialValue);
		assertEquals(initialValue, counter.getValue());
	}
	
	@Test
	public void canIncrementMultipleTimes() throws Exception {
		final long initialValue = 19;
		Counter counter = new Counter(initialValue);
		final int incrementsCount = 11;
		for(int i = 0; i < incrementsCount; i++) {
			counter.increment();
		}
		assertEquals(initialValue + incrementsCount, counter.getValue());
	}
}
