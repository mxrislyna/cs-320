package contact;

import java.util.ArrayList;

public class ContactService {

    // Stores contacts in memory while the application is running
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Adds a new contact if the contact ID is unique
    public void addContact(Contact contact) {

        // Check existing contacts for duplicate IDs
        for (Contact existingContact : contacts) {
            if (existingContact.getContactId().equals(contact.getContactId())) {
                throw new IllegalArgumentException("Contact ID already exists");
            }
        }

        // Add contact after confirming ID is unique
        contacts.add(contact);
    }
    
	 // Deletes a contact using the contact ID
	 public void deleteContact(String contactId) {
	
	     // Search through the contact list
	     for (Contact contact : contacts) {
	
	         // Remove contact when the ID matches
	         if (contact.getContactId().equals(contactId)) {
	             contacts.remove(contact);
	             return;
	         }
	     }
	
	     // Throw an error if no matching contact is found
	     throw new IllegalArgumentException("Contact ID not found");
	 }
	 
	// Updates first name using the contact ID
	 public void updateFirstName(String contactId, String firstName) {

	     Contact contact = findContact(contactId);

	     contact.setFirstName(firstName);
	 }


	 // Updates last name using the contact ID
	 public void updateLastName(String contactId, String lastName) {

	     Contact contact = findContact(contactId);

	     contact.setLastName(lastName);
	 }


	 // Updates phone number using the contact ID
	 public void updatePhone(String contactId, String phone) {

	     Contact contact = findContact(contactId);

	     contact.setPhone(phone);
	 }


	 // Updates address using the contact ID
	 public void updateAddress(String contactId, String address) {

	     Contact contact = findContact(contactId);

	     contact.setAddress(address);
	 }
	 
	// Finds a contact using the contact ID
	 private Contact findContact(String contactId) {

	     for (Contact contact : contacts) {

	         if (contact.getContactId().equals(contactId)) {
	             return contact;
	         }
	     }

	     throw new IllegalArgumentException("Contact ID not found");
	 }
	 
	// Retrieves a contact using the contact ID
	 public Contact getContact(String contactId) {

	     return findContact(contactId);
	 }
	 
	 
}