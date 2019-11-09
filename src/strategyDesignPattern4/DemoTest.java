package strategyDesignPattern4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DemoTest
{
	
	private static final Map<Integer,Integer> priceOnPRoduct = new HashMap<Integer, Integer>();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	private static Order order = new Order();
	private static PayStrategy payStrategy;
	
	static {
		priceOnPRoduct.put(1,1000);
		priceOnPRoduct.put(2,300);
		priceOnPRoduct.put(3,100);
		priceOnPRoduct.put(4,9000);
	}
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		while(!order.isClosed())
		{
			int cost;
			
			String continueChoice;
			
			do
			{
				System.out.println("Please select a product :"+"\n");
				System.out.println("1 ) clothes ");
				System.out.println("2 ) shoes ");
				System.out.println("3 ) makeup ");
				System.out.println("4 ) accessories ");
				
				int choice = Integer.parseInt(br.readLine());
				cost = priceOnPRoduct.get(choice);
				System.out.println("count...");
				int count = Integer.parseInt(br.readLine());
				order.setTotalCost(cost * count);
				
				System.out.println("Do you wish to continue press(y/n)");
				continueChoice = br.readLine();
				
			}while(continueChoice.equalsIgnoreCase("y"));
			
			if(payStrategy == null)
			{
				System.out.println("Please select a payment method:");
				System.out.println("1) paypal");
				System.out.println("2) credit card");
				
				String paymntMethod = br.readLine();
				
				if(paymntMethod.equals("1"))
				{
					payStrategy = new PayPal();
				}else
				{
					payStrategy = new PayByCredit();
				}		
				order.processOrder(payStrategy);
				
				System.out.println("pay  :"+order.getTotalCost()+"units or contineu chopping (P/C)");
				String procedd = br.readLine();
				if(procedd.equalsIgnoreCase("P"))
				{
					if(payStrategy.pay(order.getTotalCost()))
					{
						System.out.println("payment don..");
					}
					else
					{
						System.out.println("paymnet failed...");
					}
					
					order.setClosed();
				}
				
			}
			
			
		}
		
		
		
	
	}

}
