package org.sag.knowledge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEven {

	public OddEven() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an Integer..");
		int i=Integer.parseInt(br.readLine());
		
		if(i%2==0){
			
			System.out.println("the Number is Even");
		}
		else{
			System.out.println("the Number is Odd.");
		}
		

	}

}
