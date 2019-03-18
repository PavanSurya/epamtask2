package demo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleComoundInterestTest {
	 SimpleAndCompoundInterest saci=new SimpleAndCompoundInterest();
		@Test
		public void test_SimpleInterest() {
		assertEquals(720, saci.simple(2000,3 ,12));
		}
		@Test
		public void test_CompoundInterest()
		{
			assertEquals(1210.0,saci.Compound(1000, 2, 10),0.1f);
		}
		
	}
