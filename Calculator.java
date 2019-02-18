package com.shir.calculator;

import java.util.Scanner;

public class Calculator
 {

	private int result ;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void performOpertion(String st, int num) {
		OpertionType opertion = OpertionType.chackOpertionType(st);

		switch (opertion) {
		case ADD:

		{
			Add add = new Add();
			this.setResult((add.exceute(this.result, num)));
			System.out.println(this.getResult());

		}
		break;

		case SUBTRACT: {
			Subtract sub = new Subtract();
			this.setResult((sub.exceute(this.result, num)));
			System.out.println(this.getResult());
		}
			break;

		case MULTIPLY: {
			Multiply mul = new Multiply();
			this.setResult((mul.exceute(this.result, num)));
			System.out.println(this.getResult());
		}
			break;
		case DIVIDE: {
			Divide div = new Divide();
			if(div.exceute(this.result, num)!=-10000)
			{
			this.setResult((div.exceute(this.result, num)));
			System.out.println(this.getResult());
			}
			else
			{
				System.out.println("you cant divided 0");
				
			}
		}
			break;

		case QUIT:
			System.out.println("end");
	/*		
		case RANDOM:
		{
			Random rnd=new Random();
			int rndnum=rnd.exceute(num);
			Scanner scan=new Scanner(System.in);
			System.out.println("please enter opertion");
			String opertion1=scan.nextLine();
			Calculator cal=new Calculator();
			 System.out.println(cal.performOpertion(opertion1,rndnum));
	
			System.out.println(this.result);
			
		}
	*/		
		break;
		case ERROR: {
			System.out.println(st + " its not an operetor");
		}
			System.out.println(getResult());

		}
		
	}
	
	

}
