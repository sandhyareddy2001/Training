package junit2trying;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCase1 {

	@Test
	public void test1() {
		assertEquals(10,TestMe.add(10,20));
		//System.out.println("TestCase1 test method1");
	}

}
