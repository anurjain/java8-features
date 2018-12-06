package com.mydev.java;

import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;;


//Interface with only 1 functions
@FunctionalInterface
interface LogInterface {
	public void log (String log);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		LogInterface first  = (a) -> System.out.println(a);
		LogInterface second  = (a) -> System.out.println(a+"    "+a);
		comment (first, "first");
		comment (second, "second");
		
		
		// IntFunction R 	apply(int value)
		
		IntFunction<String> obj1 = (a) ->  {
			System.out.println("Int - " + a);
			return "Hello - " + a;
		};
		
		String result = obj1.apply(55);
		System.out.println(result);
		
		// IntBinaryOperator - int	applyAsInt(int left, int right)
		
		IntBinaryOperator obj2 = (a,b) -> (a+b)*10;
		
		int result2 = obj2.applyAsInt(3, 5);
		System.out.println(result2);
		
		 // IntConsumer - void	accept(int value)
		
		IntConsumer obj3 = (a) -> {
			a = a*a;
			System.out.println("Int - " + a);
		};
		obj3.accept(5);
		
		// IntSupplier - int getAsInt()
		IntSupplier obj4 =  () -> Integer.MIN_VALUE;
		System.out.println(obj4.getAsInt());
		
		// IntPredicate - boolean	test(int value)
		IntPredicate obj5 = (a) -> a > 10 ? true:false;
		System.out.println(obj5.test(25));
	}
	
	
	
	public static void comment (LogInterface log, String details) {
		log.log(details);
	}
}
