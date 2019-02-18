package com.shir.calculator;

public class Multiply implements Opertion {

	private OpertionType Multiply;

	@Override
	public OpertionType getType() {
		return Multiply;
	}

	@Override
	public int exceute(int resolt, int num) {
		// TODO Auto-generated method stub
		return (resolt * num);
	}

}
