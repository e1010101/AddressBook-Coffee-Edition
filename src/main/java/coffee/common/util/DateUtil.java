package main.java.coffee.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateUtil {

  public static boolean isValidDate(String test) {
    String dashedFormat1 = "yyyy-MM-dd";
    String dashedFormat2 = "dd-MM-yyyy";
    String slashFormat1 = "yyyy/MM/dd";
    String slashFormat2 = "dd/MM/yyyy";
    String dotFormat1 = "yyyy.MM.dd";
    String dotFormat2 = "dd.MM.yyyy";

    return testDateWithMultipleFormats(test, dashedFormat1, dashedFormat2, slashFormat1,
        slashFormat2, dotFormat1, dotFormat2);
  }

  private static boolean testDateWithMultipleFormats(String test, String... formats) {
    boolean result = false;
    for (String format : formats) {
      result |= testDateWithFormat(test, format);
    }
    return result;
  }

  private static boolean testDateWithFormat(String test, String format) {
    Date date = null;

    String formatPattern = Pattern.compile("d+|M+").matcher(Matcher.quoteReplacement(format))
        .replaceAll("\\\\d{1,2}");

    // enforce 4-digit year
    formatPattern = Pattern.compile("y+").matcher(formatPattern).replaceAll("\\\\d{4}");

    if (Pattern.compile(formatPattern).matcher(test).matches()) {

      SimpleDateFormat sdf = (SimpleDateFormat) DateFormat.getDateInstance();
      sdf.applyPattern(format);

      try {
        date = sdf.parse(test);
      } catch (ParseException e) {
        return false;
      }
    }
    return date != null;
  }

}
