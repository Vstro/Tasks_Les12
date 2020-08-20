package by.htp.les12.entity;

public abstract class BoxShaped extends Wired {
	private final int DEPTH;
	private final int HEIGHT;
	private final int WIDTH;
	
	public BoxShaped(int price, int weight, int powerConsumption, int depth, int height, int width) {
		super(price, weight, powerConsumption);
		this.DEPTH = depth;
		this.HEIGHT = height;
		this.WIDTH = width;
	}

	public int getDepth() {
		return DEPTH;
	}

	public int getHeight() {
		return HEIGHT;
	}

	public int getWidth() {
		return WIDTH;
	}
	
	@Override
	public String toString() {
		return "BoxShaped with PRICE = " + this.getPrice();
	}
}
