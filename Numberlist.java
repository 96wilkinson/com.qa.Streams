package com.qa.jordanExamples;

import java.util.Arrays;
import java.util.List;

public class Numberlist {

	static List<Integer> Numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	public void getArray() {
		System.out.println("PRINT OUT THE ARRAY OF NUMBERS");
		Numbers.stream().sorted().forEach(i -> System.out.print("" + i + ", "));
	}

	public void getMax() {
		System.out.println("");
		System.out.println("PRINT OUT THE MAX ");
		System.out.print(Numberlist.Numbers.stream().reduce((accumulator, current) -> Math.max(accumulator, current)));
	}

	public void getMin() {
		System.out.println("");
		System.out.println("PRINT OUT THE MIN ");
		System.out.print(Numberlist.Numbers.stream().reduce((accumulator, current) -> Math.min(accumulator, current)));
	}

	public void getEven() {
		System.out.println("");
		System.out.println("PRINT OUT THE EVEN NUMBERS ");
		Numberlist.Numbers.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.print("" + i + ", "));
	}

	public void getOdd() {
		System.out.println("");
		System.out.println("PRINT OUT THE ODD NUMBERS ");
		Numberlist.Numbers.stream().filter(i -> i % 2 != 0).forEach(i -> System.out.print("" + i + ", "));
	}

	public void getSum() {
		System.out.println("");
		System.out.println("PRINT OUT THE SUM OF THE ARRAY");
		System.out.println(Numberlist.Numbers.stream().reduce(0, (a, b) -> a + b));
	}

	public void getSquareOddMin() {
		System.out.println("PRINT OUT THE SQUARES AND THEN REMOVE THE EVEN NUMBERS");
		System.out.println(Numberlist.Numbers.stream().map(i -> i = (int) Math.pow(i, 2)).filter(i -> i % 2 != 0)
				.reduce((accumulator, current) -> Math.min(accumulator, current)));
	}

}
