package mini_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class App_CalculatorTest {

	@Test
	void test() 
	{
		App_Calculator calculate=new App_Calculator();
		assertEquals(30.0,calculate.evaluate("5+5*5"),"It should evaluate the infix expression 5+5*5");
	}
}
