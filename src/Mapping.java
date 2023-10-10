package src;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Mapping {

    final Map<LocalDateTime, Map<String, ScheduleInstance>> timeListHashMap = new HashMap<>();

    public static void main(String[] args) {
        final Map<LocalDateTime, Map<String, ScheduleInstance>> timeListHashMap = new HashMap<>();
        LocalDateTime localDateTime1 = LocalDateTime.now();


        System.out.printf("localDateTime1 %s",localDateTime1);
//        Map<String, ScheduleInstance> scheduleInstanceForDateTime = timeListHashMap.get(instance.getExecutionDateTime());
//        scheduleInstanceForDateTime.remove(instance.getScheduleUUID());
    }

    private class ScheduleInstance {
        private LocalDate executionDate;
        private LocalTime executionTime;
        private LocalDateTime executionDateTime;
        private String scheduleUUID;

    }
}
