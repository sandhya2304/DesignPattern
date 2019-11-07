package strategyDesignPattern3;

public class CreditCardStrategy implements PaymentStrategy
{
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateExpiry;
	
	public CreditCardStrategy(String name, String cardNumber, String cvv, String dateExpiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateExpiry = dateExpiry;
	}
	@Override
	public void pay(int amt) {
		System.out.println("pay with credit/debit :"+amt);
	}
	
	
	
	
	

}
