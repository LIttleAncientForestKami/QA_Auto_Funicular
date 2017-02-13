package daystodate;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

/**
 * @author LAFK_pl, Tomasz.Borek@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate from = LocalDate.parse(sc.nextLine());
        LocalDate to = LocalDate.parse(sc.nextLine());

        System.out.println(from + " - " + to + " => " + from.until(to, ChronoUnit.DAYS));

//        LocalDate from = LocalDate.now();
//        LocalDate to = LocalDate.of(2017, 12, 31);
//
//        System.out.println(from);
//        System.out.println(to);
//
//        System.out.println(from.until(to).getMonths() + " months"
//                + " and " + from.until(to).getDays() + " days");

//        System.out.println(from.until(to, ChronoUnit.DAYS));
    }

}
