package demo1;

public class HouseConstructionCost {
	public int  CostForHouse(String material,int squareFeet)
	{
		if(material.equals("Standard material"))
		{
			return(squareFeet*1200);
		}
		if(material.equals("Above Standard Material"))
		{
			return(squareFeet*1500);
		}
		if(material.equals("High Standard Material"))
		{
			return(squareFeet*1800);
		}
		return(squareFeet*2500);
		
	}

}
