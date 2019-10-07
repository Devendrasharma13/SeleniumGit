import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class JunitIntroduction {
	
	@BeforeClass
	public static void setUpBeforeClass()throws Exception{
		System.out.println("Executed before class");
	}
	
	@AfterClass
	public static void testDownAfterClass() throws Exception{
		System.out.println("Executed After Class...");
	}
	
	@Before
	public void setUp() throws Exception{
	
		System.out.println("Before method");
	}
	
	@After
	public void testDown() throws Exception{
		System.out.println("after method");
	}

	@Test
	void test1() {
		System.out.println("test 1");
	}
	@Test
	void test2() {
		System.out.println("test 2");
	}

}
