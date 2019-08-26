/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author CCannon
 */
public class Contact {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final String emailAddress;

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }
    
    public String Contacts(){
        return firstName + " " + lastName + " " + phoneNumber + " " + emailAddress;
    }
}
