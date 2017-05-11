package final_part3_inheritance_BrianMercurio;

public class TeacherImp1 extends PersonBaseImp1 implements Teacher {

	String thoughtCourseTitle;

	public TeacherImp1(String _name, String _thoughtCourseTitle) 
	{
		super(_name);
		
		name = _name;
		thoughtCourseTitle = _thoughtCourseTitle;
		
	}
	
	public String teachesFor()
	{
		return thoughtCourseTitle;
	}

	
	public String getDetails() {
		
		return "Teacher";
	}


	

}
