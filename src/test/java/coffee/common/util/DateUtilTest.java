package coffee.common.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import main.java.coffee.common.util.DateUtil;
import org.junit.jupiter.api.Test;

public class DateUtilTest {

  @Test
  public void isValidDate() {

    // Equivalence Partition: empty strings
    assertFalse(DateUtil.isValidDate("")); // empty string
    assertFalse(DateUtil.isValidDate(" ")); // spaces only

    // Equivalence Partition: valid dates
    // DD MM YYYY
    // Separated with dashes
    assertTrue(DateUtil.isValidDate("29-02-2020")); // valid date
    assertTrue(DateUtil.isValidDate("31-12-2020")); // valid date

    // Separated with slashes
    assertTrue(DateUtil.isValidDate("29/02/2020")); // valid date
    assertTrue(DateUtil.isValidDate("31/12/2020")); // valid date

    // Separated with dots
    assertTrue(DateUtil.isValidDate("29.02.2020")); // valid date
    assertTrue(DateUtil.isValidDate("31.12.2020")); // valid date

    // Equivalence Partition: invalid dates
    assertFalse(DateUtil.isValidDate("30-02-2020")); // invalid date

    // Equivalence Partition: invalid date formats
    assertFalse(DateUtil.isValidDate("2020 02 29")); // invalid date format
    assertFalse(DateUtil.isValidDate("20200229")); // invalid date format

    // Equivalence Partition: invalid separators
    assertFalse(DateUtil.isValidDate("2020-02/29")); // invalid separator combination
    assertFalse(DateUtil.isValidDate("2020-02.29")); // invalid separator combination
  }

}
