package org.sag.interfacedemo;

public class Diamond1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=1;
		for(int i=1;i<=7;i++){
			
			for(int j=1;j<=odd;j++){
				System.out.print("*");
				
			}
			
			System.out.println();
			if(i<4){
			odd+=2;
			}
			else{
				odd-=2;
			}
				
			
		}
		

	}

}
