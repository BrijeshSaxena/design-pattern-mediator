package org.trishinfotech.mediator;

public abstract class Calculate {

	protected String name;

	public Calculate(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract String calculate(String value);
}
