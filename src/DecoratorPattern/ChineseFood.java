package DecoratorPattern;

public class ChineseFood extends FoodDecorator {

	public ChineseFood(Food nFood) {
		super(nFood);
	}
	
	@Override
	public String prepareFood() {
		return super.prepareFood()+"cheese macrone";
	}
	
	@Override
	public double priceFood() {
		return super.priceFood()+900;
	}
	

}
