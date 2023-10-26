package sortdata;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;

public class DateSorter {
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> sortedDates = unsortedDates.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        List<LocalDate> datesWithR = sortedDates.stream()
                .filter(date -> date.getMonth() .name() .toLowerCase() .contains("r"))
                .collect(Collectors.toList());

        List<LocalDate> datesWithoutR = sortedDates.stream()
                .filter(date -> !date.getMonth() .name() .toLowerCase() .contains("r"))
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        datesWithR.addAll(datesWithoutR);
        return datesWithR;
    }
    
}
