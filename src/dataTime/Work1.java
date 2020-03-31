package dataTime;

import java.time.*;

public class Work1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(12,20);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(zonedDateTime);

        System.out.println("_____________ INSTANT ________________\n");
        Instant instant = Instant.now();
        Instant instant1 = instant.plus(Duration.ofMillis(5000));
        Instant instant2 = instant.minus(Duration.ofMillis(5000));
        Instant instant3 = instant.minusSeconds(10);
        System.out.println(instant);
        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);

        System.out.println("_____________ PERIOD ________________\n");

        Period period = Period.ofDays(6);
        System.out.println(period);
        period = Period.ofMonths(6);
        System.out.println(period);
        period = Period.between(LocalDate.now(), LocalDate.now().plusDays(60));
        System.out.println(period);
    }
}
