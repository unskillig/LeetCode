
public class Garnelen implements Gericht{

private Beilage beilage;
	
	
	
	
	@Override
	public double getPreis() {
		
		return 14.00;
	}

	@Override
	public void druckeBeschreibung() {
		System.out.println("Garnelen");
		
	}

}
