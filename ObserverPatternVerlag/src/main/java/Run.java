
public class Run {

	public static void main(String[] args) {
		FAZVerlag faz = new FAZVerlag();
		IAbonnent meyer = new Familie("Meyer", new Adresse("Heinrichstrasse", "115", "40239", "Düsseldorf", "Deutschland"));
		IAbonnent mexer = new Familie("Mexer", new Adresse("Heinrichstrasse", "116", "40239", "Düsseldorf", "Deutschland"));
		
		System.out.println(faz.getName());
		
		faz.aboHinzufuegen(meyer);
		faz.aboHinzufuegen(mexer);
		
		faz.setAktuelleZeitung(new Zeitung("Tageszeitung FAZ"));
		faz.setAktuelleZeitung(new Zeitung("Tageszeitung 2 FAZ"));
		
		faz.aboEntfernen(mexer);
		
		faz.setAktuelleZeitung(new Zeitung("Tageszeitung 3 FAZ"));
		

	}

}
