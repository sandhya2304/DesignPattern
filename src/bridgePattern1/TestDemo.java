package bridgePattern1;

public class TestDemo 
{
	public static void main(String[] args)
	{
		
		Shape red = new Circle(100,100,10,new RedCircle());
		Shape green = new Circle(100,100,10,new GreenCircle());
		
		
		red.drwa();
		green.drwa();
	}

}
