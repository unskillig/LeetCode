
public class ColorFactory implements IAbstractFactory {
public <T> T create(){
	String colorName = readFromFile();
	try {
		T color = (T) Class.forName(colorName).newInstance();
		return color;
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
		return "Black";
	}
}
