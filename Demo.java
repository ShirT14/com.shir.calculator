package com.shir.calculator;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		Scanner scan = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);
		int num;
		String operator = "";
		cal.setResult(0);

		do {
			try {
				System.out.println("please enter an operator or enter quit");
				operator = scan.nextLine();

				System.out.println("please enter a number");
				num = inputNum.nextInt();

				cal.performOpertion(operator, num);
			} catch (Exception x) {
				num = 0;
				System.out.println("worng input. ditails: " + x.toString());

			}

		}

		while (operator.toString() != "quit");

	}

}
