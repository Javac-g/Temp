package sortdata;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateSorterTest {

    @Test
    void sortDatesTest() {
        DateSorter sorter = new DateSorter();

        List<LocalDate> unsortedDates = Arrays.asList(
                LocalDate.parse("2004-07-01"),
                LocalDate.parse("2005-01-02"),
                LocalDate.parse("2007-01-01"),
                LocalDate.parse("2032-05-03")
        );

        List<LocalDate> expectedSortedDates = Arrays.asList(
                LocalDate.parse("2005-01-02"),
                LocalDate.parse("2007-01-01"),
                LocalDate.parse("2032-05-03"),
                LocalDate.parse("2004-07-01")
        );

        Collection<LocalDate> sortedDates = sorter.sortDates(unsortedDates);

        assertEquals(expectedSortedDates, sortedDates);
    }
}
