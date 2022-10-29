package main.java.common.util;

public class ValidationUtil {

  /**
   * Checks that {@code condition} is true. Used for validating arguments to methods.
   *
   * @throws IllegalArgumentException if {@code condition} is false.
   */
  public static void checkArgument(boolean condition) {
    checkArgument(condition, null);
  }

  /**
   * Checks that {@code condition} is true. Used for validating arguments to methods.
   *
   * @throws IllegalArgumentException with {@code errorMessage} if {@code condition} is false.
   */
  public static void checkArgument(Boolean condition, String errorMessage) {
    if (!condition) {
      if (errorMessage == null) {
        throw new IllegalArgumentException();
      } else {
        throw new IllegalArgumentException(errorMessage);
      }
    }
  }
}
