package com.practice.functionalProgramming;

import java.time.Clock;
import java.time.ZoneId;

public class ClockRunner {

	public static void main(String[] args) {
		Clock clock = Clock.system(ZoneId.of("Asia/Calcutta"));
		System.out.println(clock.millis());
		System.out.println(clock.instant());
		System.out.println(clock.withZone(ZoneId.of("Asia/Kolkata")));

		ZoneId.getAvailableZoneIds().stream().sorted().filter(str -> str.contains("Asia")).forEach(System.out::println);
		
		// System.out.println(ZoneId.getAvailableZoneIds());
	}

}
