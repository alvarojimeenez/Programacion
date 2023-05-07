package boletinTestUnit.ejercicios;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PruebaFuncionesTest {

	private PruebaFunciones p;
	
	@BeforeEach
	void setUp() {
		p = new PruebaFunciones();
	}
	
	@Test
	void testContarPalabra() {
		assert(p.contarNumeroVeces("hola", "hola hola hola hola")==4);
		assertFalse(p.contarNumeroVeces("hola", "hola hola hola hola")==2);
		
	}
	
	@ValueSource(strings = {"este", "programacion", "modulo"} )
	@ParameterizedTest
	void testBuscarPalabraEscondida(String buscar) {
		assert(p.buscarPalabraEscondida(buscar, "este es el modulo de programacion"));
		assert(!p.buscarPalabraEscondida(buscar, "no, el de entorno "));
		
	}
	
	
	
	
}
