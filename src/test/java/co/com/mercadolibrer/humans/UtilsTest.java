package co.com.mercadolibrer.humans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import co.com.mercadolibrer.humans.core.utils.Utils;
@SpringBootTest
public class UtilsTest {
	@Test
	void testValidateDNA1() {
		String [] dna = {"AGCT", "CGAT"};
		boolean expected = true;
		boolean current = Utils.validateDNA(dna);
		assertEquals(expected, current);
	}
	
	@Test
	void testValidateDNA2() {
		String [] dna = {"ABGCT"};
		boolean expected = false;
		boolean current = Utils.validateDNA(dna);
		assertEquals(expected, current);
	}
}
