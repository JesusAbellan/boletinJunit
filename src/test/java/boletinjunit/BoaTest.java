package boletinjunit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BoaTest {

	static Stream<Arguments> setup() {
		return Stream.of(
				Arguments.of(true,new Boa("Pepe",12,"granola bars")),
				Arguments.of(false,new Boa("Pepe",17,"ratones"))
				);
	}
	@ParameterizedTest
	@MethodSource("setup")
	void testIsHealthy(boolean exp, Boa b) {
		assertEquals(exp,b.isHealthy());
	}

	@ParameterizedTest
	@MethodSource("setup")
	void testFitsInCage(boolean exp,Boa b) {
		assertEquals(exp,b.fitsInCage(15));
	}
}
