package DecoratorPattern;

public class NonVegFood extends FoodDecorator
{

	public NonVegFood(Food nFood) {
		super(nFood);
	}

	@Override
	public String prepareFood() {
		return super.prepareFood()+"add cheese with pasta";
	}
	
	@Override
	public double priceFood() {
		// TODO Auto-generated method stub
		return super.priceFood() + 300;
	}
	

}
