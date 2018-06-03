import java.util.ArrayList;
import java.util.List;

public class WeeklyCalendar {

    private List<WeeklyEntry> entries;

    public WeeklyCalendar() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(String weekday, String notes) {
        WeeklyEntry entry = new WeeklyEntry(weekday, notes);
        this.entries.add(entry);
    }

    public Iterable<WeeklyEntry> getWeeklySchedule() {
        this.entries.sort(WeeklyEntry.BY_WEEKDAY);
        return this.entries;
    }
}