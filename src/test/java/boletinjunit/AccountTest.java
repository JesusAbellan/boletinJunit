package boletinjunit;

import static org.junit.jupiter.api.Assertions.*;

import java.text.NumberFormat;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class AccountTest {

	Account a;
	@BeforeEach
	void setup() {
		a = new Account("Pepe",123456789,3500);
	}
	static Stream<Arguments> paramsDeposit() {
		return Stream.of(
				Arguments.of(true,200),
				Arguments.of(false,-200)
				);
	}
	@ParameterizedTest
	@MethodSource("paramsDeposit")
	void testDeposit(Boolean exp, int amount) {
		assertEquals((exp),a.deposit(amount));
	}

	static Stream<Arguments> paramsWithdraw() {
		return Stream.of(
				Arguments.of(true,200,200),
				Arguments.of(false,-200,200),
				Arguments.of(false,200,-200)

				);
	}
	@ParameterizedTest
	@MethodSource("paramsWithdraw")
	void testWithdraw(Boolean exp, int amount, int fee) {
		assertEquals(exp,a.withdraw(amount, fee));
	}

	@Test
	void testAddInterest() {
		a.addInterest();
		assertEquals(3.657,5,a.getBalance());
	}


	@Test
	void testGetAccountNumber() {
		assertEquals(123456789,a.getAccountNumber());
	}

	@Test
	void testToString() {
		assertEquals(("123456789" + "\t" + "Pepe" + "\t" + NumberFormat.getCurrencyInstance().format(3500)),a.toString());
	}

}
