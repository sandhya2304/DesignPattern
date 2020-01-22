package strategyDesignPattern5;

public class PayPalStrategy implements PaymentStrategy
{
	
	String emailId;
	String password;
	
	public PayPalStrategy(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	@Override
	public void pay(int amount) {
		System.out.println("payment with paypal"+amount);
	}
	
	

}
