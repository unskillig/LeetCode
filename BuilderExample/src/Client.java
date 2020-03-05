import java.time.LocalDate;

public class Client {

	public static void main(String[] args) {
		Task t = new TaskBuilder(5).setDescription("Hallo sagen").setDone(false).setDueDate(LocalDate.now()).build();
		System.out.println(t.toString());
	}

}
