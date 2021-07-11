package main.utility;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Utility {
	private final static Logger logger= Logger.getLogger("Utility");
	public static void dayOfWeek(int m,int d,int y){
		int y1=y-(14-m)/12;
		int x=y1+y1/4-y1/100+y1/400;
		int m1=m+12*((14-m)/12)-2;
		int d1=(d+x+31*m1/12)%7;
		
		logger.log(Level.INFO, String.valueOf(d1));
	}
	
	
}
