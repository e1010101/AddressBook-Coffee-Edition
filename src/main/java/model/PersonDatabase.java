package main.java.model;

import javafx.beans.InvalidationListener;
import javafx.collections.ObservableList;
import main.java.model.database.DatabaseObject;

public class PersonDatabase implements Database {

  @Override
  public boolean hasDatabaseObject(DatabaseObject databaseObject) {
    return false;
  }

  @Override
  public void addDatabaseObject(DatabaseObject databaseObject) {

  }

  @Override
  public void deleteDatabaseObject(DatabaseObject databaseObject) {

  }

  /**
   * @return
   */
  @Override
  public ObservableList<DatabaseObject> getPersonList() {
    return null;
  }

  /**
   * @param listener The listener to register
   */
  @Override
  public void addListener(InvalidationListener listener) {

  }

  /**
   * @param listener The listener to remove
   */
  @Override
  public void removeListener(InvalidationListener listener) {

  }
}
