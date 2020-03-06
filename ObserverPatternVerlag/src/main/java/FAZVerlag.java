
public class FAZVerlag extends Verlag {

	private Zeitung aktuelleZeitung;
	private String name;

	public FAZVerlag() {
		super();
		this.name = "FAZ-Verlag";
		// TODO Auto-generated constructor stub
	}
	
	
	public void setAktuelleZeitung(Zeitung zeitung){
		this.aktuelleZeitung = zeitung;
		verteileZeitung(aktuelleZeitung);
	}
	
	public Zeitung getAktuelleZeitung(){
		return aktuelleZeitung;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}
