package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() {

	    // Create a contact service to manage contacts
	    ContactService service = new ContactService();

	    // Create a new contact
	    Contact contact = new Contact(
	            "123456789",
	            "Alyana",
	            "Garcia",
	            "1234567890",
	            "111 P. Campa Street"
	    );

	    // Add contact to the service
	    service.addContact(contact);

	    // Verify that the contact was added successfully
	    assertEquals(contact, service.getContact("123456789"));
	}
	
	@Test
	void testCannotAddDuplicateContactId() {

	    // Create a contact service
	    ContactService service = new ContactService();

	    // Create first contact
	    Contact contact1 = new Contact(
	            "123456789",
	            "Alyana",
	            "Garcia",
	            "1234567890",
	            "111 P. Campa Street"
	    );

	    // Create second contact with the same ID
	    Contact contact2 = new Contact(
	            "123456789",
	            "Maria",
	            "Santos",
	            "0987654321",
	            "456 Main Street"
	    );

	    // Add the first contact
	    service.addContact(contact1);

	    // Verify that adding a duplicate ID throws an exception
	    assertThrows(IllegalArgumentException.class, () -> {
	        service.addContact(contact2);
	    });
	}
	
	@Test
	void testDeleteContact() {

	    // Create a contact service
	    ContactService service = new ContactService();

	    // Create a contact
	    Contact contact = new Contact(
	            "123456789",
	            "Alyana",
	            "Garcia",
	            "1234567890",
	            "111 P. Campa Street"
	    );

	    // Add the contact
	    service.addContact(contact);

	    // Delete the contact using its ID
	    service.deleteContact("123456789");

	    // Verify that the contact was removed
	    assertThrows(IllegalArgumentException.class, () -> {
	        service.getContact("123456789");
	    });
	}
	
	@Test
	void testDeleteNonexistentContact() {

	    // Create a contact service
	    ContactService service = new ContactService();

	    // Verify that deleting an unknown contact ID throws an exception
	    assertThrows(IllegalArgumentException.class, () -> {
	        service.deleteContact("999999999");
	    });
	}
	
	@Test
	void testUpdateFirstName() {

	    // Create a contact service
	    ContactService service = new ContactService();

	    // Create and add a contact
	    Contact contact = new Contact(
	            "123456789",
	            "Alyana",
	            "Garcia",
	            "1234567890",
	            "111 P. Campa Street"
	    );

	    service.addContact(contact);

	    // Update first name
	    service.updateFirstName("123456789", "Maria");

	    // Verify the first name was updated
	    assertEquals("Maria", service.getContact("123456789").getFirstName());
	}
	
	@Test
	void testUpdateLastName() {

	    // Create a contact service
	    ContactService service = new ContactService();

	    Contact contact = new Contact(
	            "123456789",
	            "Alyana",
	            "Garcia",
	            "1234567890",
	            "111 P. Campa Street"
	    );

	    service.addContact(contact);

	    // Update last name
	    service.updateLastName("123456789", "Santos");

	    // Verify the last name was updated
	    assertEquals("Santos", service.getContact("123456789").getLastName());
	}
	
	@Test
	void testUpdatePhone() {

	    // Create a contact service
	    ContactService service = new ContactService();

	    // Create and add a contact
	    Contact contact = new Contact(
	            "123456789",
	            "Alyana",
	            "Garcia",
	            "1234567890",
	            "111 P. Campa Street"
	    );

	    service.addContact(contact);

	    // Update phone number
	    service.updatePhone("123456789", "0987654321");

	    // Verify the phone number was updated
	    assertEquals("0987654321", service.getContact("123456789").getPhone());
	}
	
	@Test
	void testUpdateAddress() {

	    // Create a contact service
	    ContactService service = new ContactService();

	    // Create and add a contact
	    Contact contact = new Contact(
	            "123456789",
	            "Alyana",
	            "Garcia",
	            "1234567890",
	            "111 P. Campa Street"
	    );

	    service.addContact(contact);

	    // Update address
	    service.updateAddress("123456789", "222 New Street");

	    // Verify the address was updated
	    assertEquals("222 New Street", service.getContact("123456789").getAddress());
	}

}
