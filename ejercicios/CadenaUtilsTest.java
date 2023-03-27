package boletinTestUnit.ejercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaUtilsTest {
	
	@Test 
	void testToMayusculas() {
		CadenaUtils c = new CadenaUtils();
		assertEquals(c.toMayusculas("hola"), "HOLA");
	}
	
	@Test 
	void testToMinusculas() {
		CadenaUtils c = new CadenaUtils();
		assertEquals(c.toMinusculas("hOLa"), "hola");
	}
	
	@Test 
	void testEstaEnMayusculas() {
		CadenaUtils c = new CadenaUtils();
		assertEquals(c.estaEnMayusculas("HOLA MUNDO"), true);
	}
	
	@Test 
	void testEstaEnMinusculas() {
		CadenaUtils c = new CadenaUtils();
		assertEquals(c.estaEnMinusculas(" hola mundo "), true);
	}
	
	@Test
	void testEsCapicua() {
		CadenaUtils c = new CadenaUtils();
		assertEquals(c.esCapicua("6446"), true);
		assertEquals(c.esCapicua("hola"), false);
	}
	
	@Test
	void testEsPalindromo() {
		CadenaUtils c = new CadenaUtils();
		assertEquals(c.esPalindromo("somos o no somos"), true);
		assertEquals(c.esPalindromo("hola"), false);
	}
	
	@Test
	void testEsDecimal() {
		CadenaUtils c = new CadenaUtils();
		assertEquals(c.esDecimal("645,2"), true);
		assertEquals(c.esDecimal("23"), false);
	}
	
	@Test
	void testEsEntero() {
		CadenaUtils c = new CadenaUtils();
		assertEquals(c.esEntero("645,2"), false);
		assertEquals(c.esEntero("23"), true);
	}

}
