package suhu;

import static org.junit.Assert.*;

import org.junit.Test;

import juntest.juntest;



public class SuhuTest {

	@Test

	public void test() {
		main test = new main();
		int output = test.Main(0);
		assertEquals(273, output);
	}

}
