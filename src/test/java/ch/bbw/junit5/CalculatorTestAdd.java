package ch.bbw.junit5;

import ch.bbw.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestAdd {
	// 1. Attribut calculator
	private Calculator calculator;

	@BeforeEach
	public void setUp() throws Exception {
		// 2. Objekt instanzieren
	   calculator = new Calculator();
	    
	}

	@Test
	@DisplayName("Simple add should work")
	public final void testAdd() {
		double result = calculator.add(10, 49.5);
	    // 3. Vergleicht auf Gleichheit
	    assertEquals(60, result, 0.5, "Simple add should work");
	}
	


}
