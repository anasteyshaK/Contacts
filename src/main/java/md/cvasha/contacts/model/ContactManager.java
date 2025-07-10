package md.cvasha.contacts.model;

import java.util.ArrayList;

public class ContactManager {
  private final ArrayList<Contact> contacts = new ArrayList<>();

  public void addContact(Contact contact) {
    contacts.add(contact);
  }

  public boolean removeContactFullData(Contact contactToDelete) {
    for (int i = 0; i < contacts.size(); i++) {
      Contact contact = contacts.get(i);
      if (contact.equals(contactToDelete)) {
        contacts.remove(i);
        return true;
      }
    }
    return false;
  }

  public void allContactsPresent() {
    for (Contact contact : contacts) {
      System.out.println(contact);
    }
  }
}
