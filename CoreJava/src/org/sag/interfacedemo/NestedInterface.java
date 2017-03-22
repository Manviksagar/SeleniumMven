package org.sag.interfacedemo;

interface It1{
	
	interface It2{
		void m1();
	}
}

// Nested interface is called by using It1.It2 
public class NestedInterface implements It1.It2{
	public void m1(){
		System.out.println("Nested Interface is working");
	}
	public static void main(String[] args){
		NestedInterface n1 = new NestedInterface();
		n1.m1();
	}

}
