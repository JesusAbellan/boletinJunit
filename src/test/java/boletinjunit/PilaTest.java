package boletinjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {
	
	Pila p;
	
	@BeforeEach
	void setup() {
		p = new Pila();
	}
	@Test
	void testPush() {
		p.push(5);
		assertEquals(5,p.top());
	}

	@Test
	void testPop() {
		p.push(5);
		assertEquals(5,p.pop());
	}

	@Test
	void testIsEmpty() {
		assertEquals(true,p.isEmpty());
		p.push(5);
		assertEquals(false,p.isEmpty());
	}

}
