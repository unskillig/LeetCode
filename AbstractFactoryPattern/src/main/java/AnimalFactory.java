
public class AnimalFactory implements IAbstractFactory {
	
	public <T> T create(){
		String animalType = readFromFile();
		try {
			T animal = (T) Class.forName(animalType).newInstance();
			return animal;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	//Mocked
	public static String readFromFile(){
		return "Dog";
	}
	
}
