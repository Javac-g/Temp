import java.util.List;
import java.util.stream.Collectors;package sortdata;

public class App {
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
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
