package ch.bbw;

/**
 * 
 * @author Luigi
 * @version 1.0
 * @date 18.12.2018
 * Klasse Calculator um das JUnit 
 * Framework zu demonstrieren
 *
 */
public class Calculator {

	/**
	 * mulitlies two numbers
	 * @param a
	 * @param b
	 * @return
	 */
	public double multiply(double a, double b) {
		return a * b;
	}


	/**
	 * adds two numbers together and gives back the result
	 * 
	 * @param summand1
	 * @param summand2
	 * @return summe, the result of the addition
	 */
	public double add(double summand1, double summand2) {
		return summand1 + summand2;
	}

	
	/**
	 * subtrakts number2 from number1 and gives the result back
	 * 
	 * @param subtrahend 
	 * @param minuend
	 * @return Differenz the result of the subtraktion
	 */
	public double subtrakt(double subtrahend, double minuend) {
		return subtrahend - minuend;
	}

	/**
	 * adds two numbers as Strings together and gives the result back
	 * 
	 * @param number1
	 *            as String
	 * @param number2
	 *            as String
	 * @return the result of the addition
	 */
	public double addString(String number1S, String number2S) throws IllegalArgumentException {
		double number1, number2;
		number1 = Double.parseDouble(number1S);
		number2 = Double.parseDouble(number2S);
		return number1 + number2;
	}
}
