package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCalculadora {

	@Test
	void testSuma() {
		assertEquals(5,Calculadora.suma(2,3));
	}

	@Test
	void testResta() {
		assertEquals(1,Calculadora.suma(4,3));
	}
	
	@Test
	void testMultiplica() {
		assertEquals(6,Calculadora.suma(2,3));
	}
	
	@Test
	void testDivide() {
		assertEquals(2,Calculadora.suma(6,3));
	}
}
