package org.sag.knowledge;

import java.util.ArrayList;

public class EnumTest {
	
	enum Directions{
		//normal constants
		//EAST,SOUTH,WEST,NORTH
		
		EAST(10),SOUTH(20),WEST(90),NORTH(25);
		//must be after constants
		int code;
		Directions(int code){
			this.code=code;
		}
		public int getCode(){
			return code;
		}
		
		public int getTemperature(){
			switch(this){
			case EAST:return 200;
			case NORTH:return 1200;
			case WEST:return 5200;
			case SOUTH:return 2200;
             default:return 25;
			
			}
			
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ir=Integer.valueOf(200);

		System.out.println(ir);
		System.out.println(Directions.EAST.name());
		//retuns order od enums 0,1,2,3
		System.out.println(Directions.SOUTH.ordinal());
		System.out.println(Directions.EAST.getCode());
		System.out.println(Directions.WEST.getTemperature());

		ArrayList<String>direc=new ArrayList<String>();
		for(Directions dr:Directions.values()){
			
			direc.add(dr.name());
		}

System.out.println(direc);
	}

}
