package DecoratorPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorTest
{

	private static int choice=0;
	
	public static void main(String[] args) throws NumberFormatException, IOException
	{	
		do
		{
			System.out.println("----Menu-----");
			System.out.println("1) veg food");
			System.out.println("2) non veg");
			System.out.println("3) chinese food");
			System.out.println("4) exit");
			
			System.out.println("Enter your choice ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			
			switch(choice)
			{
			   
			case 1:
				VegFood vf =new VegFood();
			    System.out.println(vf.prepareFood());
			    System.out.println(vf.priceFood());
			    break;
			case 2:
				Food non = new NonVegFood((Food)new VegFood());
				System.out.println(non.prepareFood());
				System.out.println(non.priceFood());
				break;
			case 3:
				Food chinese = new ChineseFood((Food)new VegFood());
				System.out.println(chinese.prepareFood());
				System.out.println(chinese.priceFood());
				break;
			case 4:
				System.exit(1);
				break;
				
				default:
					System.out.println("no such type of food avialble:");
			}
			
			return;
			
			
		}while(choice!= 4);

	}

}
