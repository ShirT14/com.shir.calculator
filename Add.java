package com.shir.calculator;

public class Add implements Opertion {

	private OpertionType ADD;

	@Override
	public OpertionType getType() {
		return ADD;
	}

	@Override
	public int exceute( int resolt, int num) {
		// TODO Auto-generated method stub
		return (resolt + num);
	}

}
