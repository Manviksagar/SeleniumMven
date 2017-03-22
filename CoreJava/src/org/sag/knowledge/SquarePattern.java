package org.sag.knowledge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquarePattern {

	public SquarePattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter how many rows required...");
int size=Integer.parseInt(br.readLine());
for (int i = 1; i <=size; i++) {
	for (int j = 1; j <=size; j++) {
		if(i==1||i==size||j==1||j==size){
		System.out.print("*");
		}
		else{
			System.out.print(" ");
		}
	}
	System.out.println(" ");
	
}

	}

}
