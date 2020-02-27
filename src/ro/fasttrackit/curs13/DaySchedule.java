package ro.fasttrackit.curs13;

import java.util.List;
import java.util.Objects;

public class DaySchedule {
     private final List<String> activities;
     private final Day day;

    public DaySchedule(List<String> activities, Day day) {
        this.activities = activities;
        this.day = day;
    }
    public List<String> getActivities(){
        return activities;
    }
    public Day getDay(){
        return day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return Objects.equals(activities, that.activities) &&
                day == that.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(activities, day);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "activities=" + activities +
                ", day=" + day +
                '}';
    }
}
