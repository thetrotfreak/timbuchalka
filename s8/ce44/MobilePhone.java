package s8.ce44;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        return (findContact(contact) < 0) ? true : false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int index = findContact(oldContact);

        if (index >= 0) {
            myContacts.set(index, newContact);
            return true;
        }

        return false;
    }

    public boolean removeContact(Contact contact) {

        int index = findContact(contact);

        if (index >= 0) {
            myContacts.remove(index);
            return true;
        }

        return false;
    }

    // mathces against first occurence of whole Contact object
    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    // mathces against first occurence of name only
    private int findContact(String name) {
        return myContacts.indexOf(name);
    }

    public Contact queryContact(String name) {

        int index = findContact(name);

        if (index >= 0) {
            return myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");

        int count = 0;

        for (Contact contact : myContacts)
            System.out.println(++count + ". " + contact.getName() + " ->" + contact.getPhoneNumber());

    }
}
