package strategyDesignPattern2;

public class GooglePlusStrategy  implements ISocialMediaStrategy
{
	

	@Override
	public void connectTo(String friendName) {
		System.out.println("connect to :"+friendName);
	}

	
}
