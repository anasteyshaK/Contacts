package md.cvasha.contacts.model;

import java.util.ArrayList;

public class ContactManager {
  private final ArrayList<Contact> contacts = new ArrayList<>();

  public void addContact(Contact contact) {
    contacts.add(contact);
  }

  public boolean removeByID(int idToDelete) {
    for (int i = 0; i < contacts.size(); i++) {
      Contact contact = contacts.get(i);
      if (contact.getId() == idToDelete) {
        contacts.remove(i);
        return true;
      }
    }
    return false;
  }

  public void printAllContacts() {
    for (Contact contact : contacts) {
      System.out.println(contact);
    }
  }
}
