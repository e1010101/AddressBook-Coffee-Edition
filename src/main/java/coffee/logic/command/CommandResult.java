package main.java.coffee.logic.command;

import static java.util.Objects.requireNonNull;

public record CommandResult(String feedbackToUser) {

  /**
   * Constructs a {@code CommandResult} with the specified fields.
   */
  public CommandResult(String feedbackToUser) {
    this.feedbackToUser = requireNonNull(feedbackToUser);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }

    // instanceof handles nulls
    if (!(other instanceof CommandResult otherCommandResult)) {
      return false;
    }

    return feedbackToUser.equals(otherCommandResult.feedbackToUser);
  }

}
