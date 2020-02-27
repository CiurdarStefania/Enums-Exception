package ro.fasttrackit.curs13;

import java.util.Collections;

public class MainDay {
    public static void main(String[] args) {
        DaySchedule daySchedule = new DaySchedule(Collections.singletonList("Colorat"), Day.MARTI);
        System.out.println(daySchedule);

    }
}
