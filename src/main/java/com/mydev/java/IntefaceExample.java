package com.mydev.java;

interface Interface1 {

	public void log ();
	
	public default void comment () {
		System.out.println("Interface 1 comments method");
	}
	
	public default void print () {
		System.out.println("Interface 1 default method");
	}
	
	public static void printStatic () {
		System.out.println("Interface 1 static method");
	}
	
	public default void printAll () {
		System.out.println("Interface 1 default method");
	}
}

interface Interface2 {
	public default void printAll () {
		System.out.println("Interface 2 default method");
	}
}

/**
 *
 */
public class IntefaceExample implements Interface1, Interface2
{
    public static void main( String[] args )
    {
    	IntefaceExample obj = new IntefaceExample();
    	
    	//standard interface method
    	obj.log();
    	
    	//Implemented default method
    	obj.comment();
    	
    	//default method
    	obj.print(); 
    	
    	// interface method
    	Interface1.printStatic();
    	
    	// Implemented method common between interfaces
    	obj.printAll();
    }

	@Override
	public void log() {
		System.out.println("Interface 1 implemented log method");
	}
	
	public void comment () {
		System.out.println("Interface 1 implemented comment method");
	}
	
	public void printAll () {
		System.out.println("Interface 2 implemented default method");
	}
}
