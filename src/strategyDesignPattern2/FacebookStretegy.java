package strategyDesignPattern2;

public class FacebookStretegy  implements ISocialMediaStrategy
{

	@Override
	public void connectTo(String friendName) {
		System.out.println("connect facebook :"+friendName);
	}
	

}
