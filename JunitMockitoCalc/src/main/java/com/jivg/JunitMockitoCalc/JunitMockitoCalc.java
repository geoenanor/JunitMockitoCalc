package com.jivg.JunitMockitoCalc;

import com.jivg.JunitMockitoCalc.iface.CalculatorService;

public class JunitMockitoCalc implements CalculatorService {
	private CalculatorService calcService;
	

	public void setCalcService(CalculatorService calcService) {
		this.calcService = calcService;
	}
	public double add(double input1, double input2){
		return calcService.add(input1,input2);
	}
	public double substract(double i1, double i2) {
		// TODO Auto-generated method stub
		return calcService.substract(i1, i2);
	}
	public double multiply(double i1, double i2) {
		return calcService.multiply(i1, i2);
	}
	public double divide(double i1, double i2) {
		return calcService.divide(i1, i2);
	}
	
}
