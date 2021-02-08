package boletinjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {
	
	@Test
	void testSuma() {
		assertEquals(4,OperadorAritmetico.suma(3, 1));
	}

	@Test
	void testDivision() throws Exception {
		assertEquals(2,OperadorAritmetico.division(6, 3));
		assertThrows(
	            Exception.class, 
	            () -> OperadorAritmetico.division(12,0),"No se puede dividir entre 0");
	}
}
