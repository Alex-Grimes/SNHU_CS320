package tests;
/**
 * ContactTest class
 * @DEV Alex Grimes
 * @Date 11/11/21
 */

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import contacts.Contact;

public class ContactTest {

	// An ID Length Tests
	@Test
	@DisplayName("Accepts ID with length of 1")
	void IdWithOneCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "John", "Doe", "5555555555", "8 Low");
		assertEquals("1", contact.getID());
	}
	
	@Test
	@DisplayName("Accepts ID with length of 10")
	void IdWithTenCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1234567890", "John", "Doe", "5555555555", "8 Low");
		assertEquals("1234567890", contact.getID());
	}
	
	// An ID longer than 10 chars throw exception
	@Test
	@DisplayName("ID more than 10 characters throws exception")
	void IdWithMoreThanTenCharsTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "John", "Doe", "5555555555", "8 Low");
		});
	}
	
	// A null ID throws an exception
	@Test
	@DisplayName("Null ID throws exception")
	void NullIDTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("", "John", "Doe", "5555555555", "8 Low");
		});
	}
	
	
	
	// Name Validity Checks 
	@Test
	@DisplayName("Accepts first name with length of 1")
	void FirstNameWithOneCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "A", "Doe", "5555555555", "8 Low");
		assertEquals("A", contact.getFirstName());
	}
	
	@Test
	@DisplayName("Accepts first name with length of 10")
	void FirstNameWithTenCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "ABCDEFGHIJ", "Doe", "5555555555", "8 Low");
		assertEquals("ABCDEFGHIJ", contact.getFirstName());
	}

	@Test
	@DisplayName("First name more than 10 characters throws exception")
	void FirstNameWithMoreThanTenCharsTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "ABCDEFGHIJK", "Doe", "5555555555", "8 Low");
		});
	}

	@Test
	@DisplayName("Null first name throws exception")
	void NullFirstNameTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "", "Doe", "5555555555", "8 Low");
		});
	}
	

	@Test
	@DisplayName("Accepts last name with length of 1")
	void LastNameWithOneCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "John", "A", "5555555555", "8 Low");
		assertEquals("A", contact.getLastName());
	}

	@Test
	@DisplayName("Accepts last name with length of 10")
	void LastNameWithTenCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "John", "ABCDEFGHIJ", "5555555555", "8 Low");
		assertEquals("ABCDEFGHIJ", contact.getLastName());
	}
	
	@Test
	@DisplayName("Last name more than 10 characters throws exception")
	void LastNameWithMoreThanTenCharsTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "ABCDEFGHIJK", "5555555555", "8 Low");
		});
	}

	@Test
	@DisplayName("Null last name throws exception")
	void NullLastNameTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "", "5555555555", "8 Low");
		});
	}
	
	// Phone Number Tests
	@Test
	@DisplayName("Accepts phone number with 10 chars")
	void PhoneWithTenCharsTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "John", "Doe", "1234567890", "8 Low");
		assertEquals("1234567890", contact.getPhone());
	}
	
	@Test
	@DisplayName("Phone number with 9 chars throws exception")
	void PhoneWithNineCharsTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Doe", "123456789", "8 Low");
		});
	}
	
	@Test
	@DisplayName("Phone number with 11 chars throws exception")
	void PhoneWithElevenCharsTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Doe", "12345678901", "8 Low");
		});
	}

	@Test
	@DisplayName("Null phone number throws exception")
	void NullPhoneTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Doe", "", "8 Low");
		});
	}
	
	//Address Tests 
	@Test
	@DisplayName("Accepts address with length of 1")
	void AddressWithOneCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "John", "Doe", "5555555555", "5");
		assertEquals("5", contact.getAddress());
	}
	
	@Test
	@DisplayName("Accepts address with length of 30")
	void AddressWithThirtyCharTest() throws IllegalArgumentException {
		Contact contact = new Contact("1", "John", "Doe", "5555555555", 
				"ABCDEFGHIJKLMNOPQRSTUVWXYZABCD");
		assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZABCD", contact.getAddress());
	}

	@Test
	@DisplayName("Address more than 30 characters throws exception")
	void AddressWithMoreThanThirtyCharsTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Doe", "5555555555", 
					"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDE");
		});
	}
	
	@Test
	@DisplayName("Null address throws exception")
	void NullAddressTest() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Doe", "5555555555", "");
		});
	}
	
}
