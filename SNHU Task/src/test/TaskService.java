package test;
import java.util.HashMap;

public class TaskService {
	private HashMap<String, Task> tasks;
	// Create a hashmap to store/delete tasks by ID 
	public TaskService() {
		tasks = new HashMap<>();
	}

	public void addTask (Task uniqueId) {
		tasks.put(uniqueId.getTaskId(), uniqueId);
	}

	public void deleteTask (String taskId) {
		tasks.remove(taskId);
	}

	public void updateTask (String taskId, String newName, String newDescription) {
		tasks.get(taskId).setName(newName);
		tasks.get(taskId).setDescription(newDescription);
	}
	
	public HashMap<String, Task> getTasks () {
		return tasks;
	}
}
