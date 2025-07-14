import md.cvasha.contacts.model.Contact;
import md.cvasha.contacts.model.ContactManager;

import java.util.Scanner;

public class Main {
  static ContactManager manager = new ContactManager();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contactId = 1;

    while (true) {
      System.out.println("\nMENU");
      System.out.println(
"""
1. Add Contact
2. View All Contacts
3. Delete Contact by Id
4. Exit
Choose your option:
""");

      int ch = sc.nextInt();
      sc.nextLine();

      switch (ch) {
        case 1 -> {
          addContact();
        }

        case 2 -> {
          viewAllContacts();
        }

        case 3 -> {
          deleteContact();
        }
        case 4 -> {
          System.out.println("Goodbye!");
          return;
        }

        default -> System.out.println("Try again!");
      }
    }
  }

  public static void addContact() {
    Scanner sc = new Scanner(System.in);
    int contactId = 0;

    System.out.print("First Name: ");

    String firstName = sc.nextLine();

    System.out.print("Last Name: ");
    String lastName = sc.nextLine();

    System.out.print("Phone Number: ");
    String phoneNumber = sc.nextLine();

    System.out.print("Email: ");
    String email = sc.nextLine();

    Contact contact = new Contact(contactId++, firstName, lastName, phoneNumber, email);
    manager.addContact(contact);
    System.out.println("Contact added!");
  }

  public static void viewAllContacts() {
    System.out.println("All Contacts:");
    manager.printAllContacts();
  }

  public static void deleteContact() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Remove contact by Id:");
    System.out.print("Enter Id: ");
    int idToDel = sc.nextInt();

    boolean removedByData = manager.removeByID(idToDel);

    if (removedByData) {
      System.out.println("Contact deleted.");
    } else {
      System.out.println("The contact is not found.");
    }
  }
}
