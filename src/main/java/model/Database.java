package main.java.model;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import main.java.model.database.DatabaseObject;

public interface Database extends Observable {

  boolean hasDatabaseObject(DatabaseObject databaseObject);

  void addDatabaseObject(DatabaseObject databaseObject);

  void deleteDatabaseObject(DatabaseObject databaseObject);

  /**
   * Returns an unmodifiable view of the {@code DatabaseObject} list.
   * This list will not contain any duplicate {@code DatabaseObject}s.
   */
  ObservableList<DatabaseObject> getPersonList();
}
