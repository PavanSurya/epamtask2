package demo1;

public class SimpleAndCompoundInterest {
	public int  simple(int principal,int time,int rate)
	{  System.out.format("%d",(principal*time*rate)/100);
		return((principal*time*rate)/100);
	}
	public double  Compound(double principal,double time,double rate)
	{
	  double re1= 1+(rate/100);
	  double re2=Math.pow(re1,time);
	  return(principal*re2);
	}
}


