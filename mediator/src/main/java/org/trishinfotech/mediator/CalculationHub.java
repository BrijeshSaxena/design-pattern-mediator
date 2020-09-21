package org.trishinfotech.mediator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CalculationHub {

	Map<String, Worker> calculators = new HashMap<String, Worker>();

	public CalculationHub() {
		super();
	}

	public Set<String> calculations() {
		return calculators.keySet();
	}

	public void addCalculation(String calculateName, Worker worker) {
		calculators.put(calculateName, worker);
	}

	public Worker getWorker(String calculateName) {
		return calculators.get(calculateName);
	}

}
