
public class Run {

	public static void main(String[] args) {
		
		
		IAbstractFactory factory = FactoryProvider.getFactory("Animal");
		Animal animal = factory.create();
		
		System.out.println(animal.getType());
		System.out.println(animal.makeSound());
		
		
		IAbstractFactory factory2 = FactoryProvider.getFactory("Color");
		Color color = factory2.create();
		
		System.out.println(color.getColour());
		
		
		/*
		Animal a = AnimalFactory.create();
		Color c = ColorFactory.create();
		
		System.out.println(a.getType());
		System.out.println(c.getColour());
		*/
		

	}

}
