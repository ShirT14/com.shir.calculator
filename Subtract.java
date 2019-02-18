package com.shir.calculator;

public class Subtract implements Opertion {

	private OpertionType SUBSTRACT;

	@Override
	public OpertionType getType() {
		return SUBSTRACT;
	}

	@Override
	public int exceute(int resolt, int num) {
		// TODO Auto-generated method stub
		return (resolt - num);
	}

}
