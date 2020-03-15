import java.util.ArrayList;
import java.util.List;

public abstract class Verlag {

	private List<IAbonnent> aboliste;

	public Verlag() {
		super();
		aboliste = new ArrayList<IAbonnent>();
	}

	public void aboHinzufuegen(IAbonnent abo){
		aboliste.add(abo);
	}

	public void aboEntfernen(IAbonnent abo){
		aboliste.remove(abo);
	}

	public void verteileZeitung(Zeitung zeitung){
		for(IAbonnent abo : aboliste){
			abo.erhalteZeitung(zeitung);
		}
	}

	public List<IAbonnent> getAboliste() {
		return aboliste;
	}

	public void setAboliste(List<IAbonnent> aboliste) {
		this.aboliste = aboliste;
	}

}
