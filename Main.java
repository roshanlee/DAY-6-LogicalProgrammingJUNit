package main;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.utility.ToBinary;
import main.utility.UtilityMonthlyPatment;
import main.utility.UtilityTemperature;
import main.utility.VendingMaching;

public class Main {
	private  static Logger logger= Logger.getLogger("Main");

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		
		//System.out.println(UtilityTemperature.temperatureConversion());
		//logger.log(Level.INFO,ToBinary.decToBinary(num));
		logger.log(Level.INFO,String.valueOf(VendingMaching.vendingMachine(2818)));
		//logger.log(Level.INFO,String.valueOf(UtilityMonthlyPatment.monthlyPayment(100,2,2)));
		sc.close();
	}

}
