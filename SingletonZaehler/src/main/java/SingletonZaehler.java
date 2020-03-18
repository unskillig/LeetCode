
public class SingletonZaehler {

	private static SingletonZaehler instanz;
	private static int zaehler;

	private SingletonZaehler() {
	}
	
	public synchronized static SingletonZaehler getInstance(){
		
		if(instanz == null){
			instanz = new SingletonZaehler();
			System.out.println("Neue Instanz des Zählers wurde erstellt.");
		}
		else{
			System.out.println("Es existiert bereits eine Instanz des Zählers.");
		}
		
		return instanz;
		
	}
	
	public synchronized static void deleteInstance(){
		instanz = null;
		zaehler = 0;
		System.out.println("Instanz des Zählers wurde gelöscht und der Zähler genullt.");
	}
	
	

	public static void getZaehler() {
		System.out.println(SingletonZaehler.zaehler);
	}

	public static void increaseZaehler(){
		SingletonZaehler.zaehler++;
		System.out.println("Zähler um 1 erhöht. Aktueller Zählerstand: " + SingletonZaehler.zaehler);
	}
	
	
	

}
