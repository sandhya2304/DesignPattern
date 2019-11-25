package AadapterPattern;

public class Testing {

	public static void main(String[] args)
	{
		CreditCard cc = new BankCustomer();
		cc.giveBankDetails();
		System.out.println(cc.getCreditCard());

	}

}
