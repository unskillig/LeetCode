
public class Run {

	public static void main(String[] args) {
		
		SingletonZaehler.getInstance();
		SingletonZaehler.increaseZaehler();
		SingletonZaehler.getInstance();
		SingletonZaehler.deleteInstance();
		SingletonZaehler.getInstance();
		SingletonZaehler.getZaehler();
		SingletonZaehler.increaseZaehler();
		SingletonZaehler.increaseZaehler();
		SingletonZaehler.getZaehler();
	}

}
