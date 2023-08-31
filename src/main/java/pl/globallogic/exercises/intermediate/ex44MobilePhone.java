package pl.globallogic.exercises.intermediate;
//Create a program that implements a simple mobile phone with the following
//        capabilities.
//        1. Implement the master class MobilePhone, that holds the ArrayList of Contacts, with
//        the following attributes:
//        - Two fields, a String called myNumber and an ArrayList of type Contact called
//        myContacts.
//        - A constructor that takes a String (the phone number) and initialises myNumber and
//        instantiates myContacts.
//        - And seven methods, they are (their functions are in their names):
//        - addNewContact(), has one parameter of type Contact and returns a boolean.
//        Returns true if the contact doesn't exists, or false if the contact already exists.
//        - updateContact(), has two parameters of type Contact (the old contact that will
//        be updated with the new contact) and returns a boolean. Returns true if the contact
//        exists and was updated successfully, or false if the contact doesn't exists.
//        - removeContact(), has one parameter of type Contact and returns a boolean.
//        Returns true if the contact exists and was removed successfully, or false if the
//        contact doesn't exists.
//        - findContact(), has one parameter of type Contact and returns an int. The
//        returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a
//        value greater than or equal to 0 (does exists).
//        - findContact(), same as above, only it has one parameter of type String.
//        - queryContact(), has one parameter of type String and returns a Contact. Use
//        the String to search for the name and then return the Contact. Return null otherwise.
//        - printContacts(), has no parameters and doesn't return anything. Print the
//        contacts in the following format:
//        Contact List:
//        1. Bob -> 31415926
//        2. Alice -> 16180339
//        3. Tom -> 11235813
//        4. Jane -> 23571113
//        2. Implement the Contact class with the following attributes:
//        - Two fields, both String, one called name and the other phoneNumber.
//        - A constructor that takes two Strings, and initialises name and phoneNumber.
//        - And Three methods, they are:
//        - getName(), getter for name.
//        - getPhoneNumber(), getter for phoneNumber.
//        - createContact(), has two parameters of type String (the persons name and
//        phone number) and returns an instance of Contact. This is the only method that is
//        static.

import java.util.ArrayList;

public class ex44MobilePhone {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("9999999999");

        Contact contact1 = Contact.createContact("Bob", "31415926");
        Contact contact2 = Contact.createContact("Alice", "16180339");
        Contact contact3 = Contact.createContact("Tom", "11235813");
        Contact contact4 = Contact.createContact("Jane", "23571113");

        mobilePhone.addContact(contact1);
        mobilePhone.addContact(contact2);
        mobilePhone.addContact(contact3);
        mobilePhone.addContact(contact4);

        mobilePhone.printContacts();

        System.out.println("\nUpdating contact...\n");
        Contact updatedContact3 = Contact.createContact("Mateusz", "000000000");
        mobilePhone.updateContact(contact3, updatedContact3);

        mobilePhone.printContacts();

        System.out.println("\nRemoving contact...\n");
        mobilePhone.removeContact(contact2);

        mobilePhone.printContacts();

        System.out.println("\nUpdating contacts...\n");
        Contact updatedContact1 = Contact.createContact("ALA", "111111111");
        mobilePhone.updateContact(contact1, updatedContact1);
        Contact updatedContact2 = Contact.createContact("OLA", "2222222222");
        mobilePhone.updateContact(contact4, updatedContact2);
        mobilePhone.printContacts();

        System.out.println("\nQuering Contact...\n");
        Contact queriedContact = mobilePhone.queryContact("Mateusz");
        System.out.println(queriedContact.getName() + " -> " + queriedContact.getPhoneNumber());
    }
}

class MobilePhone{
    private String myNumber;
    private final ArrayList<Contact> myContacts;

    MobilePhone(String myNumber){
        this.myNumber=myNumber;
        this.myContacts=new ArrayList<>();
    }
    public boolean addContact(Contact contact){
        if (findContact(contact)>=0){
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int positionInArray = findContact(oldContact);
        if (positionInArray<0){
            return false;
        }
        myContacts.set(positionInArray, newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        int positionInArray = findContact(contact);
        if (positionInArray<0){
            return false;
        }
        myContacts.remove(positionInArray);
        return true;
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String name) {
        int positionInArray = findContact(name);
        if (positionInArray >= 0) {
            return myContacts.get(positionInArray);
        }
        else {
            return null;
        }
    }

    public void getContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println(contact.getName());
        }
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println((i + 1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
class Contact {
    private final String name;
    private final String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}

