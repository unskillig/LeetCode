
public class Familie implements IAbonnent {

	private String name;
	private Adresse adresse;
	private Zeitung aktuelleZeitung;

	public Familie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Familie(String name, Adresse adresse) {
		super();
		this.name = name;
		this.adresse = adresse;
	}

	public void erhalteZeitung(Zeitung zeitung) {
		this.aktuelleZeitung = zeitung;
		System.out.println("Familie " + name + " erhält nun die Zeitung " + this.aktuelleZeitung.getName());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Zeitung getAktuelleZeitung() {
		return aktuelleZeitung;
	}

	
	

}
