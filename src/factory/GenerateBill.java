package factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.zip.InflaterInputStream;

public class GenerateBill 
{

	public static void main(String[] args) throws IOException
	{
		PlanFactory planFactory = new PlanFactory();
		
		System.out.println("Enter the plan you want to generate:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String plnName = br.readLine();
		
		System.out.println("Enter the units of bill to be calculated:");
		int unis = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlanFactory(plnName);
		System.out.println("bill amount:"+plnName+"units is="+unis);
		p.getRate();
		p.calculateBill(unis);
		

	}

}
