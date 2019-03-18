package demo1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseConstructionCostTest {
	    HouseConstructionCost hc=new HouseConstructionCost();
		@Test
		public void test() 
		{
			assertEquals(5400,hc. CostForHouse("High Standard Material",3));
		}
}

