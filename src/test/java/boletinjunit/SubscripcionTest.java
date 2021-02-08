package boletinjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubscripcionTest {
			
	Subscripcion s;
	@BeforeEach
	void setup() {
		s = new Subscripcion(120, 12);
	}
	@Test
	void testPrecioPorMes() {
		assertEquals(10,s.precioPorMes());
		s = new Subscripcion(0,12);
		assertEquals(0,s.precioPorMes());
	}

	@Test
	void testCancel() {
		s.cancel();
		assertEquals(0,s.precioPorMes());
	}

}
