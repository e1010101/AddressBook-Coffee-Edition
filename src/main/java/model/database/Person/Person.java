package main.java.model.database.Person;

import static main.java.common.util.CollectionUtil.requireAllNonNull;

import java.util.Objects;
import main.java.model.database.DatabaseObject;

/**
 * Represents a Person in the address book. Guarantees: details are present and not null, field
 * values are validated, immutable.
 */
public class Person extends DatabaseObject {

  // Identity fields
  private final Name name;

  // Data fields
  private final Address address;

  /**
   * Every field must be present and not null.
   */
  public Person(Name name, Address address) {
    requireAllNonNull(name, address);
    this.name = name;
    this.address = address;
  }

  public Name getName() {
    return name;
  }

  public Address getAddress() {
    return address;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder();
    builder.append(getName()).append("; Address: ").append(getAddress());
    ;
    return builder.toString();
  }

  /**
   * Returns true if both persons have the same identity and data fields.
   */
  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }

    if (!(other instanceof Person)) {
      return false;
    }

    Person otherPerson = (Person) other;
    return otherPerson.getName().equals(getName()) && otherPerson.getAddress().equals(getAddress());
  }

  @Override
  public int hashCode() {
    // use this method for custom fields hashing instead of implementing your own
    return Objects.hash(name);
  }
}
