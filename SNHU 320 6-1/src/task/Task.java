package task;

public class Task {
	// declarations task ID will be final 
	private final String taskId; 
	private String name;
	private String description;
	
	public Task (String taskId, String name, String description) {

		if (taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}

		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid name");
		}

		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
			
		this.taskId = taskId;
		this.name = name;
		this.description = description;
	}
	// Getter Methods
	public String getTaskId () {
		return taskId;
	}
	public String getName () {
		return name;
	}
	public String getDescription () {
		return description;
	}
	// Setter Methods
	public void setName(String newName) {
		name = newName;
	}
	public void setDescription(String newDescription) {
		description = newDescription;
	}
}
