
public abstract class BaseFigure {

	private int height;
	private int width;
	
	
	
	public BaseFigure() {
		this.height = 10;
		this.width = 12;
	}
	
	
	public BaseFigure(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	public abstract void draw();

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
