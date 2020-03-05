
public class Salat extends Beilage{

	public Salat(Gericht gericht) {
		super(gericht);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPreis() {
		
		return gericht.getPreis() + 6.00;
	}

	@Override
	public void druckeBeschreibung() {
		gericht.druckeBeschreibung();
		System.out.print(", Salat");
		
		
	}

}
