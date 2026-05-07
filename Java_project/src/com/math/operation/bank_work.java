package com.math.operation;

abstract class Bank{
	abstract double getInterestRate();
}

class Axis_Bank extends Bank{
	double getInterestRate() {
		return 7.5;
	}
}
class PNB extends Bank{
	double getInterestRate() {
		return 7.0;
	}
}
class SBI extends Bank{
	double getInterestRate() {
		return 6.5;
	}
}
class HDFC_Bank extends Bank{
	double getInterestRate() {
		return 8.0;
	}
}

public class bank_work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank B= new Axis_Bank();
		System.out.println(" Axis Bank current Interest rate: "+B.getInterestRate());
		B= new PNB();
		System.out.println(" PNB current Interest rate: "+B.getInterestRate());
		B= new SBI();
		System.out.println(" SBI current Interest rate: "+B.getInterestRate());
		B= new HDFC_Bank();
		System.out.println(" HDFC Bank current Interest rate: "+B.getInterestRate());

	}

}
