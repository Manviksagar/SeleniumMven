package org.sag.knowledge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ServiveImpl {
	private Map<Integer,Student>lv=BasicStatic.getStub();

	public ServiveImpl() {
		// TODO Auto-generated constructor stub
		lv.put(1, new Student(1,"sagar"));
	}
	
	public List<Student>getData(){
		
		
		return new ArrayList(lv.values());
	}
	

}
