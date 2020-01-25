package compositePattern1;

public class TestDemo
{
	public static void main(String[] args)
	{
		
		Emp ceo = new Emp("abc","cs",12000);

		Emp head = new Emp("def","it",3000);
		
		Emp sale = new Emp("sale","it",3000);
		
		ceo.add(head);
		head.add(sale);
		for(Emp ee:ceo.getSubordinate())
		{
			System.out.println(ee);
		}
		
	}

}
