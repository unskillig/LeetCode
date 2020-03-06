import java.io.IOException;

public class SchrankFactory {

	
	public static Schrank getInstance() throws IOException{
		
		// Schrankart aus einer Datei einlesen
		String schrankart = readFromFileMocked();
		
		try {
			
			//es wird nach dem Einlesen nach einer entsprechenden Klasse gesucht und 
			// falls diese gefunden wird, von dieser mittels Standardkonstruktor ein Objekt instanziiert
			Schrank schrank = (Schrank) Class.forName(schrankart).newInstance();
			return schrank;
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
	
	
	
	// hier: einlesen gemockt
	public static String readFromFileMocked(){
		return "Wohnzimmerschrank";
	}
}
