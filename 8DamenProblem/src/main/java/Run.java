import java.security.Timestamp;
import java.sql.Time;

public class Run {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
	
		Logik l = new Logik();
		l.damenSetzen(0);
		
		long ende = System.currentTimeMillis();
		System.out.println("Dauer: " + (ende-start) + " ms");

	}

}
