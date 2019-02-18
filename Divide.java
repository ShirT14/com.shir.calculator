package com.shir.calculator;

public class Divide implements Opertion {

	private OpertionType DIVIDE;

	@Override
	public OpertionType getType() {
		return DIVIDE;
	}

	@Override
	public int exceute(int resolt, int num) {
		// TODO Auto-generated method stub
		if (num != 0) {
			return (resolt / num);
		} else {
			return -10000;
			
		}
	}

}
