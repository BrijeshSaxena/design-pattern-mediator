package org.trishinfotech.mediator;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager("Kim");
		Worker martin = new Worker("Martin", new CalculateArmstrong(), manager);
		Worker racheal = new Worker("Racheal", new CalculateFactorial(), manager);
		Worker micheal = new Worker("Micheal", new CalculatePalindrome(), manager);
		martin.work(Arrays.asList(new Work[] { new Work("Armstrong", "153"), new Work("Factorial", "20"),
				new Work("Palindrome", "1234321"), new Work("Factorial", "43"), new Work("Palindrome", "12341234") }));
		racheal.work(Arrays.asList(new Work[] { new Work("Palindrome", "ABCDEDCBA"), new Work("Armstrong", "8208"),
				new Work("Palindrome", "4567887654"), new Work("Armstrong", "2104"), new Work("Factorial", "15") }));
		micheal.work(Arrays.asList(new Work[] { new Work("Armstrong", "4210818"), new Work("Factorial", "120"),
				new Work("Armstrong", "345321"), new Work("Factorial", "543"), new Work("Palindrome", "XYZZYX") }));
	}

}
