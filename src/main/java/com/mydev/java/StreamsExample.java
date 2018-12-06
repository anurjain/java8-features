package com.mydev.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Strams based on filter/map/reduce patter
 * 
 * @author
 *
 */
public class StreamsExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 6, 33, 66, 44, 33, 88, 656);
		System.out.println(list.stream().allMatch(a -> a > 20));
		List<Integer> intList = list.stream().filter(a -> a > 20).collect(Collectors.toList());
		intList.forEach(System.out::println);
		System.out.println("***************");
		// Distinct List
		list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("***************");
		// Sorted
		list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

		Map<String, Long> result = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(result);

	}

}
