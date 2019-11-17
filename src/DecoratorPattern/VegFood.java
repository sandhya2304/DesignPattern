package DecoratorPattern;

public class VegFood implements Food
{

	@Override
	public String prepareFood() 
	{	
		return "veg Food";
	}

	@Override
	public double priceFood() 
	{
		return 70.9;
	}
	

}
