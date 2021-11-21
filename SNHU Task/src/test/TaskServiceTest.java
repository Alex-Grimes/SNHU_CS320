package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class TaskServiceTest {
	@Test
	void testTaskServiceClass() {
		TaskService taskService = new TaskService();
		Task task = new Task("98765", "Name", "Dull Task Description");
		assertFalse(taskService == null);
		assertFalse(task == null);
	}

	@Test
	void testTaskServiceClassAddTask() {
		TaskService taskService = new TaskService();
		Task task = new Task("23456", "Name", "Dull Task Description");
		taskService.addTask(task);
		assertTrue(taskService.getTasks().containsValue(task));
	}

	@Test
	void testTaskServiceClassDeleteTask() {
		TaskService taskService = new TaskService();
		Task temp = new Task("23456", "Name", "Dull Task Description");
		taskService.addTask(temp);
		assertTrue(taskService.getTasks().containsValue(temp));
		taskService.deleteTask("23456");
		assertFalse(taskService.getTasks().containsValue(temp));
	}

	@Test
	void testTaskServiceClassUpdateTask() {
		TaskService taskService = new TaskService();
		Task temp = new Task("98765", "Name", "Dull Task Description");
		taskService.addTask(temp);
		assertTrue(taskService.getTasks().containsValue(temp));
		assertTrue(temp.getName().equals("Name"));
		taskService.updateTask("98765", "New Name", "This is a NEW description");
		assertTrue(taskService.getTasks().containsValue(temp));
		assertFalse(temp.getName().equals("Name"));
	}
}
