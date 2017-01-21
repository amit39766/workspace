
public class Students {
	private String ID;
	private String name;
	private String deptName;
	private String courseNo;
	private double marksObtained;
	private String grade;
	
	public Students(String iD, String name, String deptName, String courseNo, double marksObtained) {
		ID = iD;
		this.name = name;
		this.deptName = deptName;
		this.courseNo = courseNo;
		this.marksObtained = marksObtained;
	}
	public void Input(String iD, String name, String deptName, String courseNo, double marksObtained) {
		ID = iD;
		this.name = name;
		this.deptName = deptName;
		this.courseNo = courseNo;
		this.marksObtained = marksObtained;
	}
	public void calculateGrade(){
		if(marksObtained>=80)
			grade="A+";
		else if(marksObtained<80&&marksObtained>=70)
			grade="A";
		else if(marksObtained<70&&marksObtained>=60)
			grade="A-";
		else if(marksObtained<60&&marksObtained>=50)
			grade="B+";
		else if(marksObtained<50&&marksObtained>=40)
			grade="B-";
		else 
			grade="F";
		
	}
	public void displayAll(){
		System.out.println("Student ID: "+ID);
		System.out.println("Name : "+name);
		System.out.println("Dept Name: "+deptName);
		System.out.println("Course Number : "+courseNo);
		System.out.println("Marks Obtained :"+marksObtained);
		System.out.println("Grade : "+grade);
	}
	
	
}
