package org.sag.knowledge;

import java.util.HashMap;
import java.util.Map;

public class BasicStatic {
	
	public static Map<Integer,Student>st=new HashMap<Integer,Student>();

	public static Map<Integer, Student> getStub() {
		return st;
	}

}
