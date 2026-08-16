package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testValidContactCreation() {

	    // Verify that a contact can be created with valid information
	    Contact contact = new Contact(
	            "123456789",
	            "Alyana",
	            "Garcia",
	            "1234567890",
	            "111 P. Campa Street"
	    );

	    // Verify that the contact information is stored correctly
	    assertEquals("123456789", contact.getContactId());
	    assertEquals("Alyana", contact.getFirstName());
	    assertEquals("Garcia", contact.getLastName());
	    assertEquals("1234567890", contact.getPhone());
	    assertEquals("111 P. Campa Street", contact.getAddress());
	}
	
	
	@Test
	void testContactIdCannotBeNull() {

	    // Verify that a contact cannot be created with a null contact ID
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                null,
	                "Alyana",
	                "Garcia",
	                "1234567890",
	                "111 P. Campa Street"
	        );
	    });
	}
	
	@Test
	void testContactIdCannotBeTooLong() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "12345678901",
	                "Alyana",
	                "Garcia",
	                "1234567890",
	                "111 P. Campa Street"
	        );
	    });
	}
	
	@Test
	void testFirstNameCannotBeNull() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "123456789",
	                null,
	                "Garcia",
	                "1234567890",
	                "111 P. Campa Street"
	        );
	    });
	}
	
	@Test
	void testFirstNameCannotBeTooLong() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "123456789",
	                "Alyanaaaaaaa",
	                "Garcia",
	                "1234567890",
	                "111 P. Campa Street"
	        );
	    });
	}
	
	@Test
	void testLastNameCannotBeNull() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "123456789",
	                "Alyana",
	                null,
	                "1234567890",
	                "111 P. Campa Street"
	        );
	    });
	}
	
	@Test
	void testLastNameCannotBeTooLong() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "123456789",
	                "Alyana",
	                "Garciaaaaaaa",
	                "1234567890",
	                "111 P. Campa Street"
	        );
	    });
	}
	
	@Test
	void testPhoneCannotBeNull() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "123456789",
	                "Alyana",
	                "Garcia",
	                null,
	                "111 P. Campa Street"
	        );
	    });
	}
	
	@Test
	void testPhoneMustBeTenDigits() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "123456789",
	                "Alyana",
	                "Garcia",
	                "12345",
	                "111 P. Campa Street"
	        );
	    });
	}
	
	@Test
	void testAddressCannotBeInvalid() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "123456789",
	                "Alyana",
	                "Garcia",
	                "1234567890",
	                null
	        );
	    });
	}
	
	@Test
	void testAddressCannotBeTooLong() {

	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(
	                "123456789",
	                "Alyana",
	                "Garcia",
	                "1234567890",
	                "This address is definitely longer than thirty characters"
	        );
	    });
	}
}
