
public class Run {

	public static void main(String[] args) {
		
		Gericht gericht1 = new Salat(new Pommes(new Hueftsteak()));
		
		gericht1.druckeBeschreibung();
		System.out.println();
		System.out.println(gericht1.getPreis());

	}

}
