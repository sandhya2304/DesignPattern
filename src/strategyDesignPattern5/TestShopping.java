package strategyDesignPattern5;

public class TestShopping
{
	public static void main(String[] args)
	{
		ShoppingCart cart = new ShoppingCart();
		
		Item item = new Item("a1",1200);
		Item item2 = new Item("b1",1100);
		
		cart.addItem(item);
		cart.addItem(item2);
		
		cart.myPay(new CreditCardStrategy("sandy","mycard11","cvv","none"));
		cart.myPay(new PayPalStrategy("sandy@gmil.com","sandy"));

	}

}
