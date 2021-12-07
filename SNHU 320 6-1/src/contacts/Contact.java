package contacts;
/**
 * Contact class
 * @DEV Alex Grimes
 * @Date 11/11/21
 */

public class Contact {
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	//Checks The Contact ID 
	private final boolean validateID(String ID) {
		if (!(ID.isEmpty()) && ID.length() <= 10) {
			return true;
		}
		return false;
	}
	
	// Checks Contact Name 
	private final boolean validateName(String name) {
		if (!(name.isEmpty()) && name.length() <= 10) {
			return true;
		}
		return false;
	}
	
	//Checks Phone Number 
	private final boolean validatePhone(String phoneNum) {
		if (!(phoneNum.isEmpty()) && phoneNum.length() == 10) {
			return true;
		}
		return false;
	}
	
	// Checks Address 
	private final boolean validateAddress(String anAddress) {
		if (!(anAddress.isEmpty()) && anAddress.length() <= 30) {
			return true;
		}
		return false;
	}
	
// Constructor for the contact Card 
	public Contact(String ID, 
			String first, 
			String last, 
			String phoneNum, 
			String anAddress) throws IllegalArgumentException {
		
		// Error outputs for invalid entrys 
		if (this.validateID(ID)) {
			this.contactID = ID;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid ID");
		}
		
		if (this.validateName(first)) {
			this.firstName = first;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid name");
		}
		
		if (this.validateName(last)) {
			this.lastName = last;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid name");
		}
		
		if (this.validatePhone(phoneNum)) {
			this.phone = phoneNum;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid phone number");
		}
		
		if (this.validateAddress(anAddress)) {
			this.address = anAddress;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid address");
		}
	}
	
	// Setters and Getters 
	public String getID() {
		return this.contactID;
	}
	

	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setFirstName(String first) throws IllegalArgumentException {
		if (this.validateName(first)) {
			this.firstName = first;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid name");
		}
	}
	
	public void setLastName(String last) throws IllegalArgumentException {
		if (this.validateName(last)) {
			this.lastName = last;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid name");
		}
	}
	
	public void setPhone(String phoneNum) throws IllegalArgumentException {
		if (this.validatePhone(phoneNum)) {
			this.phone = phoneNum;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid phone number");
		}
	}

	public void setAddress(String anAddress) throws IllegalArgumentException {
		if (this.validateAddress(anAddress)) {
			this.address = anAddress;
		} else {
			throw new IllegalArgumentException("ERROR: Invalid address");
		}
	}
	
}


