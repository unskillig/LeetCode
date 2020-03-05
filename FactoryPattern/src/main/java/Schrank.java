import java.io.IOException;

public abstract class Schrank {

	private int hoehe, breite;


	public abstract void oeffneSchrank();

	public int getHoehe() {
		return hoehe;
	}

	public void setHoehe(int hoehe) throws IOException, NumberFormatException {
		if(hoehe > 0){
			this.hoehe = hoehe;
		}
		else{
			hoehe = 0;
		}
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) throws IOException, NumberFormatException {
		if(breite > 0){
			this.breite = breite;
		}
		else{
			breite = 0;
		}
	}
	
	
	
}
