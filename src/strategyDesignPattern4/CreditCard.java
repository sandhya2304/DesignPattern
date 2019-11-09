package strategyDesignPattern4;

public class CreditCard
{
	private int amt;
	private String number,date,cvv;
	
	
	public CreditCard() {
		// TODO Auto-generated constructor stub
	}
	
	public CreditCard(String number, String date, String cvv) {
		super();
		this.amt = 10000;
		this.number = number;
		this.date = date;
		this.cvv = cvv;
	}
	
	
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	
	
	
	
	
	
	

}
