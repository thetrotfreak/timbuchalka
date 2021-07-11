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

        if (findContact(contact) == -1) {
            myContacts.add(contact);
            return true;
        }

        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int index = findContact(oldContact);

        if (index != -1) {
            myContacts.set(index, newContact);
            return true;
        }

        return false;
    }

    public boolean removeContact(Contact contact) {

        int index = findContact(contact);

        if (index != -1) {
            myContacts.remove(index);
            return true;
        }

        return false;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String name) {

        for (Contact contact : myContacts)
            if (contact.getName().equals(name))
                return myContacts.indexOf(contact);

        return -1;
    }

    public Contact queryContact(String name) {

        int index = findContact(name);

        if (index != -1) {
            return myContacts.get(index);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");

        int count = 0;

        for (Contact contact : myContacts)
            System.out.println(++count + ". " + contact.getName() + " -> " + contact.getPhoneNumber());

    }
}
