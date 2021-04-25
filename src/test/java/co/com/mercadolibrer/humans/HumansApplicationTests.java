package co.com.mercadolibrer.humans;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import co.com.mercadolibrer.humans.core.Human;
import co.com.mercadolibrer.humans.core.utils.Utils;


@SpringBootTest
class HumansApplicationTests {

	
	@Test
	void testIsMutant() {
		String[] dna = {
				"ATGCGA",
				"CAGTGC",
				"TTATGT",
				"AGAAGG",
				"CCCCTA",
				"TCACTG"};
		Human human = new Human(dna);
		boolean expected = true;
		boolean current = human.isMutant();
		assertEquals(expected, current);
	}
	
	@Test
	void testIsMutant2() {
		String[] dna = {
				"ATGCAA",
				"CAGTGC",
				"TTATGT",
				"AGATGG",
				"CCCATA",
				"TCACTG"};
		Human human = new Human(dna);
		boolean expected = false;
		boolean current = human.isMutant();
		assertEquals(expected, current);
	}
	
	@Test
	void testIsMutant3() {
		String[] dna = {
				"ATGCAA",
				"CAGAGC",
				"TTATGT",
				"AAATTG",
				"ACCTTA",
				"TCTCTG"};
		Human human = new Human(dna);
		boolean expected = true;
		boolean current = human.isMutant();
		assertEquals(expected, current);
	}
	
	@Test
	void testIsMutant4() {
		String[] dna = {
				"AAAAAC",
				"CAGTGC",
				"TTATGT",
				"AGATGG",
				"CCCATA",
				"TCACTG"};
		Human human = new Human(dna);
		boolean expected = true;
		boolean current = human.isMutant();
		assertEquals(expected, current);
	}
}
