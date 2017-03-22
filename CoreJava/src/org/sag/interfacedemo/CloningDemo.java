package org.sag.interfacedemo;

public class CloningDemo implements Cloneable {
	
	int a= 10;
	int b=20;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloningDemo c= new CloningDemo();
		System.out.println(c.a);
		System.out.println(c.b);
		c.a=30;
		c.b=50;
		System.out.println(c.a);
		System.out.println(c.b);
		CloningDemo d=(CloningDemo) c.clone();
		c.a=100;
		c.b=200;
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println("Original CD OBJECT:");

		System.out.println(d.a);
		System.out.println(d.b);





		

		

	}

}
