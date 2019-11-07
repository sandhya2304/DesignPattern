package strategyDesignPattern2;

public class TestStrategy
{
	public static void main(String[] args)
	{
		SocialMediaContext so = new SocialMediaContext();
		so.setiSocialMediaStrategy(new FacebookStretegy());
		so.connect("sandhya");
		
		so.setiSocialMediaStrategy(new GooglePlusStrategy());
		so.connect("harsh");
		
		

	}

}
