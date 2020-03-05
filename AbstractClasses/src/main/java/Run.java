
public class Run {

	public static void main(String[] args) {
		BaseFigure rectangle = new Rectangle(33, 22);
		System.out.println(rectangle.getHeight());
		rectangle.draw();
		
		Circle circle = new Circle();
		circle.draw();
		System.out.println(circle.getWidth());

	}

}
