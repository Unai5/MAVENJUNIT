package jUnit_maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaUnitaria1Test {

	@Test
	public void test() {
		PruebaUnitaria1 p1 = new PruebaUnitaria1();
		int actual = p1.sum(10, 20);
		int expected = 30;
		assertEquals("Prueba errónea",expected,actual);
	}

}
