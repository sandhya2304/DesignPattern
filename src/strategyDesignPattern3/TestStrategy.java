package strategyDesignPattern3;

public class TestStrategy
{
	public static void main(String[] args) 
	{
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		Item item1 = new Item("201",3000);
		Item item2 = new Item("202",100);
		
		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);
		
		shoppingCart.pay(new CreditCardStrategy("Sandhya","12345","111","11/03/2016"));
		shoppingCart.pay(new PaypalStrategy("sandy@gmail.com","1234"));
		
		
		
	}

}
