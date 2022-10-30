package main.java.coffee.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;
import main.java.coffee.model.Database;

public interface DatabaseStorage {

  Path getDatabaseFilePath();

  Optional<Database> readDatabase() throws IOException;

}
