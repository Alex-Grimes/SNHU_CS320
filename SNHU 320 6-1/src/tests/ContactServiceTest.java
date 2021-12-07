package tests;
/**
 * ContactServiceTest class
 * @DEV Alex Grimes
 * @Date 11/11/21
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import contacts.ContactService;

public class ContactServiceTest {
	// Contacts have unique ID
	@Test
	@DisplayName("Contacts are added with unique ID")
	void UniqueIdTest() {
		ContactService contacts = new ContactService();
		contacts.addContact("John", "Doe", "1234567890", "5 Low");
		contacts.addContact("Jane", "Doe", "5555555555", "5 Low");
		contacts.addContact("Alex", "Grim", "0987654321", "9 High");
		assertNotEquals(contacts.contacts.get("1").getID(), contacts.contacts.get("2").getID());
		assertNotEquals(contacts.contacts.get("2").getID(), contacts.contacts.get("3").getID());
		assertNotEquals(contacts.contacts.get("1").getID(), contacts.contacts.get("3").getID());
	}
	
	// Contacts can be deleted
	@Test
	@DisplayName("Contacts can be deleted")
	void DeleteContactTest() {
		ContactService contacts = new ContactService();
		contacts.addContact("John", "Doe", "1234567890", "5 Low");
		contacts.addContact("Jane", "Doe", "5555555555", "5 Low");
		contacts.addContact("Alex", "Grim", "0987654321", "9 High");
		contacts.deleteContact("2");
		assertFalse(contacts.contacts.containsKey("2"));
	}
	
	// First name can be updated
	@Test
	@DisplayName("Fist name can be updated")
	void UpdateFirstNameTest() {
		ContactService contacts = new ContactService();
		contacts.addContact("John", "Doe", "1234567890", "5 Low");
		contacts.updateFirstName("1", "Joe");
		assertEquals("Bob", contacts.contacts.get("1").getFirstName());
	}
	
	// Last name can be updated
	@Test
	@DisplayName("Last name can be updated")
	void UpdateLastNameTest() {
		ContactService contacts = new ContactService();
		contacts.addContact("John", "Doe", "1234567890", "5 Low");
		contacts.updateLastName("1", "Smith");
		assertEquals("Doe", contacts.contacts.get("1").getLastName());
	}
	
	// Phone number can be updated
	@Test
	@DisplayName("Phone number can be updated")
	void UpdatePhoneTest() {
		ContactService contacts = new ContactService();
		contacts.addContact("John", "Doe", "1234567890", "5 Low");
		contacts.updatePhone("1", "5555555555");
		assertEquals("5555555555", contacts.contacts.get("1").getPhone());
	}
	
	// Address can be updated
	@Test
	@DisplayName("Address can be updated")
	void UpdateAddressTest() {
		ContactService contacts = new ContactService();
		contacts.addContact("John", "Doe", "1234567890", "5 Low");
		contacts.updateAddress("1", "10 Woodwork");
		assertEquals("10 Woodwork", contacts.contacts.get("1").getAddress());
	}
	

}
