package org.trishinfotech.mediator;

public class Work {

	protected String calculateName;
	protected String value;

	public Work() {
		super();
	}

	public Work(String calculateName, String value) {
		super();
		this.calculateName = calculateName;
		this.value = value;
	}

	public String getCalculateName() {
		return calculateName;
	}

	public void setCalculateName(String calculateName) {
		this.calculateName = calculateName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Work [calculateName=").append(calculateName).append(", value=").append(value).append("]");
		return builder.toString();
	}

}
