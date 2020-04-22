package pwnmahto.datetime.basics;

import java.time.LocalTime;

/**
 * A program to demonstrate the use of Java 8 LocalTime API. Java LocalTime
 * class is an immutable class that represents time with a default format of
 * hour-minute-second. It inherits Object class and implements the Comparable
 * interface. *
 */

public class LocalTimeExample {

	public static void main(String args[]) {

		LocalTime localTime = LocalTime.now(); // current time
		System.out.println("Current time is : " + localTime);

		System.out.println("Current hour is : " + localTime.getHour());
		System.out.println("Current minute is : " + localTime.getMinute());
		System.out.println("Current Second is : " + localTime.getSecond());
		System.out.println("Current Nano is : " + localTime.getNano()); // Gets the nano-of-second field.

		// creating an object of LocalTime
		LocalTime localTime2 = LocalTime.of(11, 26, 43);
		System.out.println("\n" + localTime2);

		// examples of plusHours() and plusMinutes() methods
		LocalTime time1 = LocalTime.of(10, 43, 12);
		System.out.println("\n" + time1);
		LocalTime time2 = time1.plusHours(4);
		System.out.println(time2);
		LocalTime time3 = time2.plusMinutes(18);
		System.out.println(time3);

		System.out.println("\n");

		// examples of minusHours() and minusMinutes() methods
		LocalTime time4 = LocalTime.of(9, 23, 54);
		System.out.println(time4);
		LocalTime time5 = time4.minusHours(5);
		System.out.println(time5);
		LocalTime time6 = time5.minusMinutes(58);
		System.out.println(time6);
	}

}
