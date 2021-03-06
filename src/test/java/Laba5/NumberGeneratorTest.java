package Laba5;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Laba2.NumberGenerator;

	public class NumberGeneratorTest {

		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
	}

		@Before
		public void setUp() throws Exception {
	}

		@Test
		public void test() {
			boolean prov = false;
			double numb = NumberGenerator.Number();
			if (numb <=150 && numb >= 60) {
				prov = true;
			}
			assertTrue(prov);
		}

}