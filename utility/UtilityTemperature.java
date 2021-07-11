package main.utility;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class UtilityTemperature {
	
	public static Scanner sc=new Scanner(System.in);
	private  static Logger logger= Logger.getLogger("UtilityTemperature");
	
	public static double temperatureConversion(){
		
	
		logger.log(Level.INFO, "Enter the Choise \n 1.Celsius to Fahrenheit \n 2.Fahrenheit to Celsius ");
		int choise=sc.nextInt();
		switch(choise){
		case 1:
			return celsiusToFaren();
		case 2:
			return farenToCelsius();
		default:
			logger.log(Level.INFO,"You Typed Incorrect Choice ");
		}
		
		return temperatureConversion();
	}
	public static double celsiusToFaren(){
		logger.log(Level.INFO,"Enter the Number");
        int cel=sc.nextInt();
        double fer=(cel*9.0/5)+32;
		
		return fer;
	}
	public static double farenToCelsius(){
		logger.log(Level.INFO,"Enter the Number");
        int fer=sc.nextInt();
        double cel=(fer-32)*5.0/9;
		
		return cel;
	}
	

}
