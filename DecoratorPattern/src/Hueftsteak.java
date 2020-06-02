
public class Hueftsteak implements Gericht{

	
	
	@Override
	public double getPreis() {
		
		return 12.00;
	}

	@Override
	public void druckeBeschreibung() {
		System.out.print("Hüftsteak");
		
	}

}
