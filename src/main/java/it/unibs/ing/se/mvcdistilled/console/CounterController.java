package it.unibs.ing.se.mvcdistilled.console;

import it.unibs.ing.se.mvcdistilled.model.CounterRepository;

public class CounterController {
	private final CounterRepository repository;
	
	public CounterController(CounterRepository repository) {
		this.repository = repository;
	}

	public void run() {
		CounterView view = new CounterView(this);
		view.render(this.repository.getCounter());
	}
	
	public void incrementCounter() {
		this.repository.getCounter().increment();
	}
}
