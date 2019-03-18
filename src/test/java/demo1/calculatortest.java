package demo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatortest {

	calculator ct=new calculator();
	@Test
	public void test_addtion() {
		assertEquals(27,ct.addition(10, 17));}
	
	@Test
	public void test_subraction()
	{
		assertEquals(-11,ct.subraction(5, 16));
	}
  @Test	
  public void test_division()
  {
	  assertEquals(3, ct.division(18, 6));
  }
 @Test
 public void test_multiply()
 {
	 assertEquals(30,ct.multiply(5, 6));
 }
}