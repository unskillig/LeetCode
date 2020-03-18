
public class Pommes extends Beilage{

	public Pommes(Gericht gericht) {
		super(gericht);
	}
	


	@Override
	public double getPreis() {
		
		return gericht.getPreis() + 3.00;
	}

	@Override
	public void druckeBeschreibung() {
		gericht.druckeBeschreibung();
		System.out.print(", Pommes");
		
	}


	
	

}
