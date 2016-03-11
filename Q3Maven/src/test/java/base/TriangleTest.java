package base;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	

	@Test
	public void testTriangle() {
		Triangle t = new Triangle();
		t.setSide1(3);
		t.setSide2(4);
		t.setSide3(5);
		double dExpectedPerimeter = 12;
		double dActualPerimeter = t.getPerimeter();
		
		assertTrue(dExpectedPerimeter == dActualPerimeter);
		
		double dActualArea = t.getArea();
		double dExpectedArea = 6;
		
		assertTrue(dActualArea == dExpectedArea);
		
		t.toString();
	}

}
