package main.utility;

public class UtilityMonthlyPatment {
	public static double monthlyPayment(int P,double Y,double R){
		
		
		double r=R/(12.0*100);
		double n=12*Y;
		double payment=P*r/(1-Math.pow((1+r),(-n)));
		return payment;
	}
	
}
