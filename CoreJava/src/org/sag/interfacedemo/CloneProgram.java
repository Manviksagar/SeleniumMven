package org.sag.interfacedemo;

public class CloneProgram implements Cloneable{
	public int id;
	public String name;

	public CloneProgram(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloneProgram c1=new CloneProgram(1, "Sagar");
		CloneProgram c2=(CloneProgram) c1.clone();
		System.out.println(c1.id+ " "+c1.name);
		System.out.println("After Cloning");
		
		System.out.println(c2.id+ " "+c2.name);
		

	}

}
