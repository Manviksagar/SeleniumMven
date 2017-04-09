package org.sag.knowledge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionTest {
	
	public List<String> display(){
		
		
		
		
		return  Arrays.asList("Sagar","java","App");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(new CollectionTest().display());
		//to create random number use Random class
		Random r= new Random();
		for(int i=0;i<=3;i++){
		int number=r.nextInt(6);
		System.out.println(number);
		}
		List<String> ar=new CollectionTest().display();
		System.out.println(ar);
		System.out.println(Math.sqrt(9));

		Collections.sort(ar);
		System.out.println(ar);
		for(String a:ar){
			System.out.println(a);
		}
	}

}
