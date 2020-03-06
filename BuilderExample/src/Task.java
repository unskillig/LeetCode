import java.time.LocalDate;

public class Task {

	private final long id;
	private String description;
	private boolean done;
	private LocalDate dueDate;
	
	public Task(long id) {
		super();
		this.id = id;
	}
	
	public Task(long id, String description, boolean done, LocalDate dueDate) {
		super();
		this.id = id;
		this.description = description;
		this.done = done;
		this.dueDate = dueDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public long getId() {
		return id;
	}
	
	public String toString(){
		return this.id + ":" + this.description + ":" + this.done + ":" + this.dueDate;
	}
	
	
	
}
