package com.mydev.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class CollectionExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(22);
		list.add(32);
		list.add(55);
		list.add(66);
		list.removeIf(n -> (n < 25));

		list.forEach(System.out::println);

		List<String> list2 = Arrays.asList("Orange", "Apple", "Banana");
		Spliterator<String> s = list2.spliterator();
		s.tryAdvance(System.out::println);

	}

}
