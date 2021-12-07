package tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import task.Task;


public class TaskTest {

	@Test
	void testTaskClass() {
		Task task = new Task("56783", "Name", "Dull task Decription");
		assertTrue(task.getTaskId().equals("56783"));
		assertTrue(task.getName().equals("Name"));
		assertTrue(task.getDescription().equals("Dull task Decription"));
	}
		
	@Test
	void testTaskClassTaskIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("567836789123", "Name", "Dull task Decription");
		});
	}
	
	@Test
	void testTaskClassTaskIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Name", "Dull task Decription");
		});
	}

	@Test
	void testTaskClassNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("56783", "This name is too long", "Dull task Decription");
		});
	}
	
	@Test
	void testTaskClassNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("56783", null, "Dull task Decription");
		});
	}
	

	@Test
	void testTaskClassDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("56783", "Name", "This description is too long and should throw an exception");
		});
	}
	
	@Test
	void testTaskClassDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("56783", "FirstName", null);
		});
	}
}
