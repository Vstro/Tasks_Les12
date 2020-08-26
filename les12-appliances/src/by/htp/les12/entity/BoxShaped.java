package by.htp.les12.entity;

public abstract class BoxShaped extends Wired {
	private final int Depth;
	private final int Height;
	private final int Width;
	
	public BoxShaped(int price, int weight, int powerConsumption, int depth, int height, int width) {
		super(price, weight, powerConsumption);
		this.Depth = depth;
		this.Height = height;
		this.Width = width;
	}

	public int getDepth() {
		return Depth;
	}

	public int getHeight() {
		return Height;
	}

	public int getWidth() {
		return Width;
	}
	
	public String getInfo() {
		return "BoxShaped with PRICE = " + this.getPrice();
	}
}
