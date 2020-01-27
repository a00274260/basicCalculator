package baicCal;

public class BasicCalculator {
	
	
	public static int add3Ints(int number1, int number2, int number3) {
		
		int result = 0;	
		
		result = number1 + number2 + number3;
		
		return result;
		
	}
	
	public static int subtract3Ints(int number1, int number2, int number3)
	{
		int result = 0;
				
		result = number1 - number2 - number3;
		
		return result;
	}
	
	public static int multiply3Ints(int number1, int number2, int number3)
	{
		int result = 0;
				
		result = number1 * number2 * number3;
		
		return result;
	}
	
	public static int divide3Ints(int number1, int number2, int number3)
	{
		int result = 0;
				
		result = number1 / number2 / number3;
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int sumOf3Ints = 0;
		int subtractionOf3Ints = 0;
		int multiplicationOf3Ints = 0;
		int divisionOf3Ints = 0;
		
		sumOf3Ints = add3Ints(num1, num2, num3);
		subtractionOf3Ints = subtract3Ints(num1, num2, num3);
		multiplicationOf3Ints = multiply3Ints(num1, num2, num3);
		divisionOf3Ints = divide3Ints(num1, num2, num3);
		
	}

}