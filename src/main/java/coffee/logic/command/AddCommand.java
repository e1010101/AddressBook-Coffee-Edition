package main.java.coffee.logic.command;

import main.java.coffee.logic.command.exception.CommandException;
import main.java.coffee.model.Database;
import main.java.coffee.model.database.DatabaseObject;

public class AddCommand extends Command {

  public static final String COMMAND_WORD = "add";

  public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a person to the address book. "

      + "Parameters: NAME "

      + "Example: " + COMMAND_WORD

      + " John Doe";

  public static final String MESSAGE_SUCCESS = "New person added: %1$s";

  public static final String MESSAGE_DUPLICATE_PERSON = "This person already exists in the address book";

  public AddCommand(DatabaseObject databaseObject) {
    // TODO Auto-generated constructor stub
  }

  /**
   * @param database {@code Database} which the command should operate on.
   * @return
   * @throws CommandException
   */
  @Override
  public CommandResult execute(Database database) throws CommandException {
    return null;
  }

}
