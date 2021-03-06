package com.practice.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateRunner {
	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.isLeapYear());
		System.out.println(localDate.lengthOfMonth());
		System.out.println(localDate.toEpochDay());

		Period period = Period.ofDays(1);

		System.out.println(localDate.plus(period));

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
	}
}
