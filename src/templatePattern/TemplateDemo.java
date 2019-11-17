package templatePattern;

public class TemplateDemo 
{
	public static void main(String[] args) throws ClassNotFoundException, 
	                    InstantiationException, IllegalAccessException
	{
		
	//	Class c = Class.forName(args[0]);
	//	Game g = (Game) c.newInstance();
     //  g.play();  
		
		Game game = new Chess();
		game.play();
		
		
		System.out.println("soxcceerr  is here....");
		game.play();
		
	}

}
