package boletinjunit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FridgeTest {

	Fridge f;
	@BeforeEach
	void init() {
		f = new Fridge();
	}
	
	static Stream<Arguments> setup() {
		return Stream.of(
				Arguments.of(true,"Platano"),
				Arguments.of(false,"Pera")
				);
	}

	@ParameterizedTest
	@MethodSource("setup")
	void testContains(boolean exp,String item) {
		f.put(item);
		assertEquals(exp,f.contains("Platano"));
	}

	@ParameterizedTest
	@MethodSource("setup")
	void testTake(boolean exp, String item) throws Exception {
		f.put(item);
		try{f.take("Platano");
		}
		catch(Exception e) {fail("El platano no está contenido");}
	}

}
