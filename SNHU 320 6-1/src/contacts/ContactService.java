package contacts;
/**
 * ContactService class
 * @DEV Alex Grimes
 * @Date 11/11/21
 */

import java.util.HashMap;

public class ContactService {
	int currentID = 0;
	public HashMap<String, Contact> contacts = new HashMap<String, Contact>(); //hash map to hold contacts
	
	// Controls to create delete and modify contacts 
	public void addContact(String first, 
			String last,
			String phoneNum,
			String anAddress) {
		++currentID;
		String newID = Integer.toString(currentID);
		
		try {
			Contact newContact = new Contact(newID, first, last, phoneNum, anAddress);
			contacts.put(newContact.getID(), newContact);
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}
	

	public void deleteContact(String ID) {
		if (contacts.containsKey(ID)) {
			contacts.remove(ID);
		}
	}
	

	public void updateFirstName(String ID, String newName) {
		if (contacts.containsKey(ID)) {
			try {
				contacts.get(ID).setFirstName(newName);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
	}
	

	public void updateLastName(String ID, String newName) {
		if (contacts.containsKey(ID)) {
			try {
				contacts.get(ID).setLastName(newName);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
	}

	public void updatePhone(String ID, String newPhone) {
		if (contacts.containsKey(ID)) {
			try {
				contacts.get(ID).setPhone(newPhone);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
	}
	

	public void updateAddress(String ID, String newAddress) {
		if (contacts.containsKey(ID)) {
			try {
				contacts.get(ID).setAddress(newAddress);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
	}


}
