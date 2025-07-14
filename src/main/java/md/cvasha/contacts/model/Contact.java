package md.cvasha.contacts.model;

import java.util.Objects;

public class Contact {
  private int id;
  private String name;
  private String lastname;
  private String number;
  private String email;

  public Contact(int id, String name, String lastname, String number, String email) {
    this.id = id++;
    this.name = name;
    this.lastname = lastname;
    this.number = number;
    this.email = email;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Contact(String name, String lastname, String number, String email) {
    this.name = name;
    this.lastname = lastname;
    this.number = number;
    this.email = email;
  }

  public Contact() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Contact contact = (Contact) o;
    return id == contact.id
        && Objects.equals(name, contact.name)
        && Objects.equals(lastname, contact.lastname)
        && Objects.equals(number, contact.number)
        && Objects.equals(email, contact.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastname, number, email);
  }

  @Override
  public String toString() {
    return "\n"
        + "Contact №"
        + id
        + "\n"
        + "Name :"
        + name
        + "\n"
        + "Lastname : "
        + lastname
        + "\n"
        + "Number= :"
        + number
        + "\n"
        + "Email :"
        + email;
  }
}
