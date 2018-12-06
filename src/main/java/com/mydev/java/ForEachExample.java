package com.mydev.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachExample {
    public static void main( String[] args )
    {
        List<Integer> list = new ArrayList <Integer> ();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        
        Iterator<Integer> iter = list.iterator();
        
        while (iter.hasNext()) {
        	Integer obj = iter.next();
        	System.out.println("Iterator :"+obj.intValue());
        }
        
        // New Java 8 way. Simple way with Consumer functional interface as param and no need to self iterate
        list.forEach(a -> System.out.println("For Each :" +a));
    }
}
