package org.trishinfotech.mediator;

import java.math.BigInteger;

public class CalculateFactorial extends Calculate {

	public CalculateFactorial() {
		super("Factorial");
	}

	@Override
	public String calculate(String value) {
		String answer = "NA";
		try {
			long longValue = Long.parseLong(value);
			BigInteger factorialValue = BigInteger.valueOf(1);
			for (long i = 1; i <= longValue; i++) {
				factorialValue = factorialValue.multiply(BigInteger.valueOf(i));
			}
			answer = factorialValue.toString();
		} catch (NumberFormatException exp) {
			System.out.println("Can't calculate factorial of " + value);
		}
		return answer;
	}

}
