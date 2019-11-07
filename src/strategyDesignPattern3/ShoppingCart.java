package strategyDesignPattern3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
	
	private List<Item> items;
	
	public ShoppingCart() {
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item)
	{
		items.add(item);
	}
	
	public void removeItem(Item item)
	{
		this.items.remove(item);
	}
	
	public int calculteTotal()
	{
		int sum = 0;
		for(Item i: items)
		{
			sum += i.getPrice();
		}
		return sum;	
	}
	
	public void pay(PaymentStrategy paymentMethod)
	{
		int amt = calculteTotal();
		paymentMethod.pay(amt);
	}
	
	
}
