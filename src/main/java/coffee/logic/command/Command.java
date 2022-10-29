package main.java.coffee.logic.command;

import main.java.coffee.logic.command.exception.CommandException;
import main.java.coffee.model.Database;

/**
 * Represents a command with hidden internal logic and the ability to be executed.
 */
public abstract class Command {

  /**
   * Executes the command and returns the result message.
   *
   * @param database {@code Database} which the command should operate on.
   * @return feedback message of the operation result for display
   * @throws CommandException If an error occurs during command execution.
   */
  public abstract CommandResult execute(Database database) throws CommandException;

}
