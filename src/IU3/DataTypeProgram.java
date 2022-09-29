package IU3;

public class DataTypeProgram {

	public static void main(String[] args) {
		
		//Declare variable
		int studentId;
		char studentFirstIntial;
		String studentName;
		int studentAge;
		String studentCollege;
		double studentGPA;
		boolean hasStudentPerformanceAddendance;
		
		//Assign Value
		studentId=12345;
		studentFirstIntial='5';
		studentName="HeinHtetAung";
		studentAge=21;
		studentCollege="Lithan";
		studentGPA=8.5;
		hasStudentPerformanceAddendance=true;
		
		//Printing student details
		System.out.println("-------STUDENT INFORMATION-------");
		System.out.println("STUDENT ID  :" +studentId);
		System.out.println("STUDENT INTIAL :" +studentFirstIntial);
		System.out.println("STUDENT NAME :" +studentName);
		System.out.println("STUDENT AGE :" +studentAge);
		System.out.println("STUDENT COLLEGE :" +studentCollege);
		System.out.println("STUDENT GPA :" +studentGPA);
		System.out.println(hasStudentPerformanceAddendance);
		System.out.println("----------------------------------");
		
		

	}

}
