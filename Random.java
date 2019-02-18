package com.shir.calculator;

import java.util.Scanner;

public class Random implements Opertion {

	private OpertionType RANDOM;

	@Override
	public OpertionType getType() {
		return RANDOM;
	}

	public int exceute(int num) {
		// TODO Auto-generated method stub
		java.util.Random rnd = new java.util.Random();
		int n = rnd.nextInt(num) - num;
		
		return n;
		
		

	}

	@Override
	public int exceute(int resolt, int num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
