import md.cvasha.contacts.model.Contact;
import md.cvasha.contacts.model.ContactManager;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ContactManager manager = new ContactManager();
    int contactId = 1;

    while (true) {
      System.out.println("\nMENU");
      System.out.println("1. Add Contact");
      System.out.println("2. View All Contacts");
      System.out.println("3. Delete Contact by full data");
      System.out.println("4. Exit");
      System.out.print("Choose your option: ");
      int ch = sc.nextInt();
      sc.nextLine();

      switch (ch) {
        case 1:
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
          break;

        case 2:
          System.out.println("All Contacts:");
          manager.allContactsPresent();
          break;

        case 3:
          System.out.println("Remove contact by full data:");
          System.out.print("First Name: ");
          String firstNameDel = sc.nextLine();

          System.out.print("Last Name: ");
          String lastNameDel = sc.nextLine();

          System.out.print("Phone Number: ");
          String phoneNumberDel = sc.nextLine();

          System.out.print("Email: ");
          String emailDel = sc.nextLine();

          Contact contactToDelete =
              new Contact(firstNameDel, lastNameDel, phoneNumberDel, emailDel);
          boolean removedByData = manager.removeContactFullData(contactToDelete);

          if (removedByData) {
            System.out.println("Contact deleted.");
          } else {
            System.out.println("The contact is not found.");
          }
          break;
        case 4:
          System.out.println("Goodbye!");
          return;

        default:
          System.out.println("Try again!");
      }
    }
  }
}
