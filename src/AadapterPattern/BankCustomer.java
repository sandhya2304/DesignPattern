package AadapterPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard
{

	@Override
	public void giveBankDetails()
	{
		
		try
		{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the nbank name");
			String bankName = br.readLine();
			System.out.println("\n");
			
			System.out.println("customer name is...");
			String customerName = br.readLine();
			System.out.println("\n");
			
			System.out.println("account numebr");
			int accNo = Integer.parseInt(br.readLine());
			System.out.println("\n");
			
			setBankName(bankName);
			setAccHolderName(customerName);
			setAccNumber(accNo);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}

	@Override
	public String getCreditCard()
	{
		int accNo = getAccNumber();
		String accholder = getAccHolderName();
		String bankname = getBankName();
		
		
		return "acc no is"+accNo+" accholder are "+accholder+" bank name is "+bankname;
	}
	

}
