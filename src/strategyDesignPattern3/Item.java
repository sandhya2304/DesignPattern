package strategyDesignPattern3;

public class Item
{
	
	private String upCode;
	private int price;
	
	public Item(String upCode, int price) {
		super();
		this.upCode = upCode;
		this.price = price;
	}

	public String getUpCode() {
		return upCode;
	}

	public int getPrice() {
		return price;
	}
	
	

}
