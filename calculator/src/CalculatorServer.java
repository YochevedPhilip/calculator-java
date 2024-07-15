import java.util.Scanner;

public class CalculatorServer {

		public static double add(double num1, double num2) {
			return num1+num2;
		} 
		
		public static double substract(double num1, double num2) {
			return num1-num2;
		} 
		
		public static double multiply(double num1, double num2) {
			return num1*num2;
		} 
		
		public static double divide(double num1, double num2) {
			return num1/num2;
		} 
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter first number"); 
			double num1 = scanner.nextDouble(); 
			System.out.println("Enter second number"); 
			double num2 = scanner.nextDouble(); 	
			System.out.println("Enter the operation (+,-,*,/)"); 
			String operation  = scanner.next(); 
			
			double result = 0; 
			
			switch(operation) {
			case "+": 
				result = add(num1,num2); 
				System.out.println("=" + result);
				break;
			case "-": 
				result = substract(num1,num2); 
				System.out.println("=" + result);
				break;
			case "*": 
				result = multiply(num1,num2); 
				System.out.println("=" + result);
				break;
			case "/": 
				result = divide(num1,num2); 
				System.out.println("=" + result);
				break;
			} 
			
			scanner.close();
	
			
		}
		
		
	}

