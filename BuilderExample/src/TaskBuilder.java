import java.time.LocalDate;

public class TaskBuilder {

	private final long id;
	private String description;
	private boolean done;
	private LocalDate dueDate;
	
	public TaskBuilder(long id){
		super();
		this.id = id;
	}

	public TaskBuilder(long id, String description, boolean done, LocalDate dueDate) {
		super();
		this.id = id;
		this.description = description;
		this.done = done;
		this.dueDate = dueDate;
	}
	
	public TaskBuilder setDescription(String description){
		this.description = description;
		return this;
	}

	
	public TaskBuilder setDone(boolean done){
		this.done = done;
		return this;
	}
	
	public TaskBuilder setDueDate(LocalDate dueDate){
		this.dueDate = dueDate;
		return this;
	}
	
	public Task build(){
		return new Task(id, description, done, dueDate);
	}
	
	
}
