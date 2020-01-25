package bridgePattern1;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius,int x, int y) {
		System.out.println("draw green circel"+x+ " y "+y);

	}

}
