package it.unibs.ing.se.mvcdistilled.console;

import it.unibs.ing.se.mvcdistilled.model.CounterRepository;

public class Main {
	public static void main(String[] args) {
		CounterRepository repository = new CounterRepository();
		
		CounterController controller = new CounterController(repository);
		
		while(true) {
			controller.run();
		}
	}
}
