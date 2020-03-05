
public class Logik {

	private int anzahlDamen = 0;
	private Spielfeld feld = new Spielfeld();
	private int anzahlLoesungen = 0;
	private final char DAME = 'D';
	private final char FREI = 'X';
	
	
	
	
	
	public Logik() {
		super();
		feld.feldInitialisieren();
		feld.feldAusgeben();
	}

	public void damenSetzen(int zeile){
		if(zeile == feld.getGroesse()){
			anzahlLoesungen++;
			System.out.println("Lösung gefunden.");
			feld.feldAusgeben();
			return;
		}
		
		for(int j = 0; j < feld.getGroesse(); j++){
			if(posUeberpruefen(zeile, j)){
				feld.setValueFeld(new Punkt(zeile, j), DAME);
				damenSetzen(++zeile);
				feld.setValueFeld(new Punkt(--zeile, j), FREI);
			}
		}
		
		
		
	}

	private boolean posUeberpruefen(int zeile, int spalte) {
		//oben
		for(int i = zeile; i >= 0; i--){
			if(feld.getValueFeld(new Punkt(i, spalte)) == DAME){
				return false;
			}
		}
		
		//diagonal links oben
		for(int i = zeile, j = spalte; i >= 0 && j >= 0; i--, j--){
			if(feld.getValueFeld(new Punkt(i, j)) == DAME){
				return false;
			}
		}
		
		//diagonal rechts oben
		for(int i = zeile, j = spalte; i >= 0 && j < feld.getGroesse(); i--, j++){
			if(feld.getValueFeld(new Punkt(i, j)) == DAME){
				return false;
			}
		}
		
		return true;
	}
}
