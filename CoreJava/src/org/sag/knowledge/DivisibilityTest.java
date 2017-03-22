package org.sag.knowledge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisibilityTest {

	public DivisibilityTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a1,a2;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number");
		a1=Integer.parseInt(br.readLine());
		System.out.println("Enter Divisible nuber..");
		a2=Integer.parseInt(br.readLine());
		if((a1%a2)==0){
			System.out.println(a1+" the number is perfectly Divisible "+a2);
		}else
		{
			System.out.println(a1+" Not perfectly Divisble by "+a2);
		}

		

	}

}
