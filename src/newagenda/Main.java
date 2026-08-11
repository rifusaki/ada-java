package newagenda;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> meetings = new ArrayList<>();
        meetings.add("24/07/2026 15:30");
        meetings.add("10/08/2026 09:00");
        meetings.add("11/08/2026 18:45");
        meetings.add("01/01/2020 08:00");
        meetings.add("not-a-date");

        List<LocalDateTime> upcoming = parseUpcomingMeetings(meetings);

        upcoming.sort(LocalDateTime::compareTo);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd 'de' MMMM, HH:mm");

        System.out.println("Upcoming meetings:");
        for (LocalDateTime meeting : upcoming) {
            System.out.println("- " + meeting.format(formatter));
        }
    }

    private static List<LocalDateTime> parseUpcomingMeetings(List<String> meetings) {
        List<LocalDateTime> upcoming = new ArrayList<>();
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        for (String meeting : meetings) {
            try {
                LocalDateTime dateTime = LocalDateTime.parse(meeting, parser);
                if (dateTime.isAfter(LocalDateTime.now())) {
                    upcoming.add(dateTime);
                }
            } catch (DateTimeParseException e) {
                System.out.println("Skipping invalid date: \"" + meeting + "\"");
            }
        }

        return upcoming;
    }
}
