package strategyDesignPattern3;

public class PaypalStrategy implements PaymentStrategy
{
	
	String email;
	String password;
	
	public PaypalStrategy(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(int amt) {
	System.out.println("pay with debit/credit :"+amt);
	}
	
	
	

}
