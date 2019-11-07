package strategyDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyPatternDemo
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number1");
		int num1 =Integer.parseInt(br.readLine());
		
		System.out.println("enter number 2");
        int num2 = Integer.parseInt(br.readLine());
        
        Context context = new Context(new Addition());
        System.out.println(context.executeStrategy(num1, num2));
        
        Context cont = new Context(new Subtraction());
        System.out.println(cont.executeStrategy(num1, num2));
		
		
	}

}
