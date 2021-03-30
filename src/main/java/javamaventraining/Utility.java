package javamaventraining;

import java.util.Scanner;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * @author srilekha
 * Utility class is used to perform arithmetic operations.
 */

public class Utility {
		
	private static final Logger logger = LogManager.getLogger(Utility.class);
	
	
	/**
	 * This method is used for addition of two numbers
	 * @param num1 
	 * @param num2
	 * @return
	 */
	public int sum(int num1,int num2) { 
		
		return num1+num2;
		
	}
	
	
	/**
	 * This method is used for finding multiplication of two numbers
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int product(int num1, int num2) {
			
			return num1*num2;
			
	}
	
	
	/**
	 * This method is used for finding square of a number
	 * @param num1
	 * @return
	 */
	public int square(int num1) {
			
			return num1*num1;
			
	}
	
	/**
	 * This method is used for finding average of two numbers 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int mean(int num1, int num2) {
			
			return (num1+num2)/2;
			
	}
	
	public static void main(String[] args) {
		
		Utility u = new Utility();
		Scanner scan = new Scanner(System.in);
		logger.info("Enter first number");
		int num1=scan.nextInt();
		logger.info("Enter second number");
		int num2=scan.nextInt();
		scan.close();
		
		logger.info(u.sum(num1,num2));
		logger.info(u.product(num1,num2));
		logger.info(u.square(num1));
		logger.info(u.mean(num1,num2));
		
	}

}
