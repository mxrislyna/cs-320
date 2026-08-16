package contact;

public class Contact {

    // Contact ID is final because it cannot be updated after creation
    private final String contactId;

    // These fields can be updated after the contact is created
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor creates a Contact object and validates required fields
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {

        // Contact ID must exist and cannot exceed 10 characters
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID");
        }
        this.contactId = contactId;

        // First name must exist and cannot exceed 10 characters
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;

        // Last name must exist and cannot exceed 10 characters
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;

        // Phone number must exist and contain exactly 10 digits
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;

        // Address must exist and cannot exceed 30 characters
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }

    // Returns the contact ID. No setter exists because ID cannot be changed.
    public String getContactId() {
        return contactId;
    }

    // Returns first name
    public String getFirstName() {
        return firstName;
    }

    // Returns last name
    public String getLastName() {
        return lastName;
    }

    // Returns phone number
    public String getPhone() {
        return phone;
    }

    // Returns address
    public String getAddress() {
        return address;
    }

    // Updates first name after validating the value
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }
        this.firstName = firstName;
    }

    // Updates last name after validating the value
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }
        this.lastName = lastName;
    }

    // Updates phone number after validating that it contains exactly 10 digits
    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
        this.phone = phone;
    }

    // Updates address after validating the value
    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}