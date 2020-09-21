package org.trishinfotech.mediator;

public class CalculatePalindrome extends Calculate {

	public CalculatePalindrome() {
		super("Palindrome");
	}

	@Override
	public String calculate(String value) {
		String answer = "false";
		if (value != null && !value.trim().isEmpty()) {
			String reverse = (new StringBuilder(value).reverse().toString());
			answer = Boolean.toString(reverse.equals(value));
		}
		return answer;
	}

}
