package ch.bbw;

/**
 * @author Luigi Cavuoti
 * @version 1.0
 */
public class TestCalculator {

	public static void main(String[] args) {
		// Instanz einer Calculator Classe erzeugen
		Calculator calculator = new Calculator();
		// lokale variable result = 600
		double result = calculator.add(100, -500);
		// Bedingung
		if (result != -400) {
			System.out.println("Ungueltiges Resultat = " + result);
		} else {
			System.out.println("Resultat stimmt, Juhui!");
		}
	}
}
