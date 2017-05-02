package it.unibs.ing.se.mvcdistilled.console;

import java.util.Scanner;

import it.unibs.ing.se.mvcdistilled.model.Counter;

public class CounterView {
	private final CounterController ctrl;
	private final Scanner scanner = new Scanner(System.in);

	public CounterView(CounterController ctrl) {
		this.ctrl = ctrl;
	}
	
	public void render(Counter counter) {
		System.out.printf("Counter value is %d\n", counter.getValue());
		System.out.println("Enter + to increment");
		String line = scanner.nextLine();
		if(line.equals("+")) {
			ctrl.incrementCounter();
		}
	}
}
