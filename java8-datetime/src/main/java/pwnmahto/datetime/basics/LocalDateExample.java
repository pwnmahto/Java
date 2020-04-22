package pwnmahto.datetime.basics;

import java.time.LocalDate;

/**
 * A program to demonstrate the use of Java 8 LocalDate API. Java LocalDate
 * class is an immutable class that represents Date with a default format of
 * yyyy-MM-dd. It inherits Object class and implements the ChronoLocalDate
 * interface
 */

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now(); // Current Date
		System.out.println("Current Date : " + today);

		LocalDate yesterday = today.minusDays(1);
		System.out.println("Yesterday's Date : " + yesterday);

		LocalDate tomorrow = yesterday.plusDays(2);
		System.out.println("Tomorrow's Date : " + tomorrow);

		// a program to check a Leap Year
		if (today.isLeapYear()) {
			System.out.println("The year " + today.getYear() + " is a leap year.");
		} else {
			System.out.println("The year " + today.getYear() + " is not a leap year.");
		}
	}

}
