
public class SingletonZaehler {

	private static SingletonZaehler instanz;
	private static int zaehler;

	private SingletonZaehler() {
	}
	
	public synchronized static SingletonZaehler getInstance(){
		
		if(instanz == null){
			instanz = new SingletonZaehler();
			System.out.println("Neue Instanz des Z�hlers wurde erstellt.");
		}
		else{
			System.out.println("Es existiert bereits eine Instanz des Z�hlers.");
		}
		
		return instanz;
		
	}
	
	public synchronized static void deleteInstance(){
		instanz = null;
		zaehler = 0;
		System.out.println("Instanz des Z�hlers wurde gel�scht und der Z�hler genullt.");
	}
	
	

	public static void getZaehler() {
		System.out.println(SingletonZaehler.zaehler);
	}

	public static void increaseZaehler(){
		SingletonZaehler.zaehler++;
		System.out.println("Z�hler um 1 erh�ht. Aktueller Z�hlerstand: " + SingletonZaehler.zaehler);
	}
	
	
	

}
