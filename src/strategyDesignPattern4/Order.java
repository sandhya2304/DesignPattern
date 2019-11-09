package strategyDesignPattern4;

public class Order
{
	
	private int totalCost = 0;
	private boolean isClosed = false;
	
	
	public void processOrder(PayStrategy payStrategy)
	{
		payStrategy.collectDeatils();
	}


	public int getTotalCost() {
		return totalCost;
	}


	public void setTotalCost(int Cost) {
		this.totalCost += Cost;
	}


	public boolean isClosed() {
		return isClosed;
	}


	public void setClosed() {
		this.isClosed = true;
	}
	
	
	

}
