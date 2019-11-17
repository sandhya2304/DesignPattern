package DecoratorPattern;

public abstract class FoodDecorator implements Food
{
	
	private Food newFood;
	
	public FoodDecorator(Food nFood)
	{
		this.newFood = nFood;
	}
	
	@Override
	public String prepareFood() 
	{	
		return newFood.prepareFood();
	}

	@Override
	public double priceFood() 
	{
		return newFood.priceFood();
	}
	
	

}
