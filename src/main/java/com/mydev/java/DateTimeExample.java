package com.mydev.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		LocalDate futureDate = localDate.plusDays(5);
		System.out.println(futureDate);
		System.out.println(futureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalDate newDate = LocalDate.of(2018, 01, 02);
		System.out.println(newDate);
	}
}
