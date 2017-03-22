package org.sag.interfacedemo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingKeyBoard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Name:");
		String st=bf.readLine();
		System.out.println("the Name you have Entered is "+st);
		
		

	}

}
