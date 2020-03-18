import java.util.concurrent.SynchronousQueue;

public class Spielfeld {

	private final int groesse = 12;
	private char feld[][] = new char[groesse][groesse];
	private final char FREI = 'X';
	
	
	
	

	public Spielfeld() {
		super();
	}

	public char[][] getFeld() {
		return feld;
	}

	public void setValueFeld(Punkt p, char value) {
		this.feld[p.getX()][p.getY()] = value;
	}
	
	public char getValueFeld(Punkt p) {
		return this.feld[p.getX()][p.getY()];
	}

	public int getGroesse() {
		return groesse;
	}
	
	public void feldInitialisieren(){
		for(int i = 0; i < groesse; i++){
			for(int j = 0; j < groesse; j++){
				this.feld[i][j] = FREI;
			}
		}
	}
	
	public void feldAusgeben(){
		for(int i = 0; i < groesse; i++){
			for(int j = 0; j < groesse; j++){
				System.out.print(this.feld[i][j]);
			}
			System.out.println();
		}
	}

}
