package org.sag.datademo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ReadProperty {
	
	public static Properties pr=new Properties();
	
	public static void readPropertyFile(){
	try {
		pr.load(new FileInputStream("C:\\Users\\SAGAR\\RepotGit\\CoreJava\\sag.properties"));
		System.out.println(pr.getProperty("name"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	}
	
	public static void writePropertyToFile(){
		try {
			OutputStream or=new FileOutputStream("C:\\Users\\SAGAR\\RepotGit\\CoreJava\\sag.properties");
			pr.setProperty("Role", "Tester");
			try {
				pr.store(or, "Succesfully Saved");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readPropertyFile();
		writePropertyToFile();

	}

}
