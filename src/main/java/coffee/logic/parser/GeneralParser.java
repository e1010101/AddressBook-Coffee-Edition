package main.java.coffee.logic.parser;

import static main.java.coffee.common.core.Messages.MESSAGE_DISPLAY_HELP;
import static main.java.coffee.common.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import main.java.coffee.logic.command.Command;
import main.java.coffee.logic.parser.exception.ParseException;

public class GeneralParser {

  /**
   * Used for initial separation of command word and args.
   */
  private static final Pattern BASIC_COMMAND_FORMAT = Pattern.compile(
      "(?<commandWord>\\S+)(?<arguments>.*)");

  public Command parseCommand(String userInput) throws ParseException {

    final Matcher matcher = BASIC_COMMAND_FORMAT.matcher(userInput.trim());

    if (!matcher.matches()) {
      throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, MESSAGE_DISPLAY_HELP));
    }

    final String commandWord = matcher.group("commandWord");
    final String arguments = matcher.group("arguments");

    return null;
  }

}
