package final_part3_inheritance_BrianMercurio;

public class MainEntry {

	public static void main(String[] args) 
	{
		Person p1, p2;
		Teacher t = new TeacherImp1("Ilker", "Java");
		Student s = new StudentImp1("Brian", "Java");
		
		p1 = t;
		p2 = s;
		
		
		System.out.println("p1 = " + p1.getName() + " p2 = " + p2.getName());
	}

}
