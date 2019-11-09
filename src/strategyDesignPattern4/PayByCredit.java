package strategyDesignPattern4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PayByCredit implements PayStrategy
{
	private static final BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    private CreditCard creditCard;
	
	@Override
	public boolean pay(int payAmt)
	{
		if(isCardPresent())
		{
			System.out.println("payning ..."+payAmt+" by vy credit");
			creditCard.setAmt(creditCard.getAmt() - payAmt);
			
			return true;
		}
		
		return false;
	}
	
	public boolean isCardPresent()
	{
		return creditCard != null;
	}

	@Override
	public void collectDeatils()
	{
		try
		{
			System.out.println("enter card number:");
			String number = br.readLine();
			System.out.println("enter date:");
			String date = br.readLine();
			System.out.println("enter cvv...");
			String cvv = br.readLine();
			
			creditCard = new CreditCard(number, date, cvv);
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	

}
