package org.trishinfotech.mediator;

import java.util.Arrays;

public class Manager {

	protected CalculationHub hub = new CalculationHub();
	private String name;

	public Manager(String name) {
		super();
		this.name = name;
	}

	public void assignWorker(Worker worker) {
		hub.addCalculation(worker.getCalculate().getName(), worker);
		System.out.printf("'%s' will manage '%s' for '%s' work\n", name, worker.getName(),
				worker.getCalculate().getName());
	}

	public void manage(Worker requester, Work work) {
		Worker rightWorker = hub.getWorker(work.calculateName);
		System.out.printf("'%s' is re-assigning '%s' to '%s' on request of '%s'.\n", name, work, rightWorker.getName(),
				requester.getName());
		rightWorker.work(Arrays.asList(new Work[] { work }));
	}

	public CalculationHub getHub() {
		return hub;
	}

	public String getName() {
		return name;
	}

}
