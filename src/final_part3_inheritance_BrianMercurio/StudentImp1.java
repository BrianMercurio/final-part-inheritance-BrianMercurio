package final_part3_inheritance_BrianMercurio;

public class StudentImp1 extends PersonBaseImp1 implements Student {
	
	String takenCourseTitle;

	public StudentImp1(String _name, String _takenCourseTitle) {
		super(_name);
		
		
		name = _name;
		takenCourseTitle = _takenCourseTitle;
	}

	
		
	public String getDetails() {
		
		return null;
	}

	
	public String studiesFor() 
	{
		
		return takenCourseTitle;
	}




	public String name() {
		
		return null;
	}

}
