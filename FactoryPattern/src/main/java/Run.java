import java.io.IOException;

public class Run {

	public static void main(String[] args) {
		try {
			Schrank schrank = SchrankFactory.getInstance();
			schrank.setBreite(100);
			schrank.setHoehe(200);
			schrank.oeffneSchrank();
			System.out.println(schrank.getBreite());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
