package strategyDesignPattern2;

public class SocialMediaContext 
{
	

	private ISocialMediaStrategy iSocialMediaStrategy;
	
	public void setiSocialMediaStrategy(ISocialMediaStrategy iSocialMediaStrategy) {
		this.iSocialMediaStrategy = iSocialMediaStrategy;
	}
	
	
	public void connect(String name)
	{
		iSocialMediaStrategy.connectTo(name);
	}

}
