package strategyDesignPattern4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PayPal implements PayStrategy
{
	private static final HashMap<String,String> dbase = new HashMap<String, String>();
	private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private String email;
	private String password;
	private boolean signIn;
	
	
	static {
		dbase.put("sandhya","1234");
		dbase.put("harsh", "431");
	}
	
	@Override
	public boolean pay(int payAmt)
	{
		if(signIn)
		{
			System.out.println("payin :"+payAmt+"by paypal");
			return true;
		}else
		{
			return false;
		}
		
		
	}
	
	private boolean verfiy()
	{
		setSignIn(email.equals(dbase.get(password)));
		return signIn;
	}

	@Override
	public void collectDeatils()
	{	
		try
		{
			while(!signIn)
			{
				
				System.out.println("enter user's email");
				email = br.readLine();
				System.out.println("enter users password");
				password = br.readLine();
				
				System.out.println("ho jaa");
				if(verfiy())
				{
					System.out.println("data verification has been successfully....");
				}else
				{
					System.out.println("must be valid login");
				}				
			}		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	

	public void setSignIn(boolean signIn) {
		this.signIn = signIn;
	}
	
	

}
