package org.trishinfotech.mediator;

public class CalculateArmstrong extends Calculate {

	public CalculateArmstrong() {
		super("Armstrong");
	}

	@Override
	public String calculate(String value) {
		String answer = "false";
		try {
			long longValue = Long.parseLong(value);
			long number = longValue;
			long armstrongValue = 0;
			while (number != 0) {
				long temp = number % 10;
				armstrongValue = armstrongValue + temp * temp * temp;
				number /= 10;
			}
			answer = Boolean.toString(String.valueOf(armstrongValue).equals(value));
		} catch (NumberFormatException exp) {
			System.out.println("Can't calculate armstrong of " + value);
		}
		return answer;
	}

}
