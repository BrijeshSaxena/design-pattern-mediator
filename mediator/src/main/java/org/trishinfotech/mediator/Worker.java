package org.trishinfotech.mediator;

import java.util.List;

public class Worker {

	protected String name;
	protected Calculate calculate;
	protected Manager manager;

	public Worker(String name, Calculate calculate, Manager manager) {
		this.name = name;
		this.calculate = calculate;
		this.manager = manager;
		manager.assignWorker(this);
		System.out.printf("'%s' will perform '%s' work.\n", name, calculate.getName());
	}

	public String getName() {
		return name;
	}

	public Calculate getCalculate() {
		return calculate;
	}

	public Manager getManager() {
		return manager;
	}

	public void work(List<Work> works) {
		System.out.printf("\n'%s' is performing assigned works.\n", name);
		works.stream().forEach(work -> {
			if (calculate.getName().equalsIgnoreCase(work.getCalculateName())) {
				System.out.printf("'%s' is doing '%s'.\n", name, work);
				System.out.printf("Result is: %s.\n", calculate.calculate(work.getValue()));
			} else {
				System.out.printf(
						"'%s' is not performing '%s'; So passing to the manager '%s' to manage and re-assignment.\n",
						name, work, manager.getName());
				manager.manage(this, work);
			}
		});
	}

}
