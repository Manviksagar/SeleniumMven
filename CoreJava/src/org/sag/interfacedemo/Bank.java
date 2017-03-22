package org.sag.interfacedemo;

public class Bank {
	public String name;
	public String city;
	public void withDraw(){
		System.out.println("ur account is withdraw");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank sagar=new Bank();
		sagar.name="UAT Sagar";
		sagar.city="rajamundry";
		sagar.withDraw();
		System.out.println("ur name is "+sagar.name+"ur city is "+sagar.city);
		

	}

}
