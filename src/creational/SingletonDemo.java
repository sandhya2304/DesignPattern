package creational;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingletonDemo 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		
		JDBCSingleton jdbc = JDBCSingleton.getInstance();		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int choice;
		int count = 1;
		
		do {
			
			System.out.println("Database connection..............");
			System.out.println("---------------------------------");
			
			System.out.println("1) Insert User");
			System.out.println("2) Update User");
			System.out.println("3) Delete User");
			System.out.println("4) View User");
			System.out.println("5) Exit");
			
			
			System.out.println(" \n");
			System.out.println("Please enter the choice you want to perform in database :");
			choice =Integer.parseInt(br.readLine());
			
			switch(choice)
			{
				
			case 1:
			{
				System.out.println("Please enter username into database :");
				String username = br.readLine();
				
				System.out.println("Please enter password into database :");
				String password = br.readLine();
				
				try
				{
					int i = jdbc.insertData(username, password);
					if(i>0)
					{
						System.out.println((count++) +"insert successfullyyy.....");
					}else
					{
						System.out.println("Retry the procedure");
					}
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
			break;
			
			case 2:
			{
				System.out.println("Please enter username to udpate :");
				String username = br.readLine();
				
				System.out.println("Please enter password to update :");
				String password = br.readLine();
				
				System.out.println("id you want to update");
				int uid = Integer.parseInt(br.readLine());
				
				try
				{
					int i = jdbc.updateData(username, password, uid);
					if(i>0)
					{
						System.out.println((count++) +"update successfullyyy.....");
					}else
					{
						System.out.println("Retry the procedure");
					}
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
			break;
			case 3:
			{
				
				System.out.println("id you want to delete");
				int uid = Integer.parseInt(br.readLine());
				
				try
				{
					int i = jdbc.deletData(uid);
					if(i>0)
					{
						System.out.println((count++) +"deleted successfullyyy.....");
					}else
					{
						System.out.println("Retry the procedure");
					}
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
			break;
			
			case 4:
			{
				System.out.println("Please enter username to udpate :");
				String username = br.readLine();
				
				try
				{
					jdbc.viewAllDataByName(username);
					
				    System.out.println(" user detail is here :) ...");
					
					
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
			break;
				case 5:
				{
					 System.out.println("Thank you for using..");	
					System.exit(0);			  
				}
				break;
				
		default:
			return;
				
			}
			
			
			
		}while(choice!=5);
		
		
		
		

	}

}
