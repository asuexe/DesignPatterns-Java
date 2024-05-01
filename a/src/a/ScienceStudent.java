package a;

public class ScienceStudent extends Student {
	
	String branch;
	String name;
	String MB_marks;
	ScienceStudent(String branch,String name,String MB_marks){
		this.branch = branch;
		this.name = name;
		this.MB_marks = MB_marks;
	}
	public String getInfo() {
		System.out.println("Name of Student is:"+name);

		System.out.println("Branch of Student is:"+branch);

		System.out.println("Maths/Bio marks of Student is:"+MB_marks);
		return null;
	}

}
