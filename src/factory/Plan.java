package factory;

public abstract class Plan
{
	
	protected double rate;
	public void getRate() {};
	public void calculateBill(int units)
	{
	  System.out.println("calculate bill" +units * rate);	
	}

}
