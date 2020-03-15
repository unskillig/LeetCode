
public class FactoryProvider {

	public static IAbstractFactory getFactory(String choice) {
		
		if(choice.equalsIgnoreCase("Color")){
			return new ColorFactory();
		}
		
		else if(choice.equalsIgnoreCase("Animal")){
			return new AnimalFactory();
		}
		
		
		
		return null;
	}
}
