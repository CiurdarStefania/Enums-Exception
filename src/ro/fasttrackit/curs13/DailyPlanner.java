package ro.fasttrackit.curs13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    private final List<DaySchedule> days;

    public DailyPlanner(List<DaySchedule> days) {
        this.days = days;
    }

    public Map<Day, List<String>> endPlanning() throws Exception {
        Map<Day, List<String>> result = new HashMap<>();
       try{ for (DaySchedule zile : days) {
           if (zile.getDay().equals(null)) {
               List<String> list = new ArrayList<>();
               list.add(zile.getActivities())
           }
       }
        }catch (NoActivitiesForDayException e){
          System.out.println("   ");
       }
        return result;
    }

    public List<String> getActivities(Day day) {
        List<String> result = new ArrayList<>();
        for (DaySchedule zile : days) {
            // result.get(zile.getActivities());
        }
        return result;
    }

    public void removeActivity(Day day, List<String> activities) throws NoActivityException {
        for (DaySchedule zile : days) {
            if (zile.getActivities().equals(null)) {
                days.remove(zile.getActivities());
                throw new NoActivityException(activities);
            }
        }
        System.out.println("   ");
    }

    public void addActivity(Day day, List<String> activities) throws NoActivityException {
        for (DaySchedule zile : days) {
            if (zile.getActivities().equals(null)) {
                days.add((DaySchedule) zile.getActivities());
                throw new NoActivityException(activities);
            }
        }
        System.out.println("   ");

    }
}
