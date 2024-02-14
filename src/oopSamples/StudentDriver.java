package oopSamples;
import java.util.ArrayList;
public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1 = new Student("John");
//		s1.address = "chennai";
//		s1.gpa = 4.5f;
//		
//		Student s2 = new Student("Peter");
//		s2.address = "BLR";
//		s2.gpa = 4.3f;
		
//		System.out.println("Student1.." + s1.name +s1.gpa +s1.address);
//		System.out.println("Student2 .." +s2.name +s2.gpa + s2.address);
//		
		Student mstd = new MNCStudent("Steve");
		mstd.gpa=9;
		mstd.goToClass();
	
		Student pstd = new PaidStudent("Mike");
		pstd.gpa =7;
		pstd.goToClass();
	
		//Dynamic Binding
		Student astd = new AuditStudent("Nancy");
		astd.goToClass();
		
		//INTERFACE invoke 
		
		MNCStudent mstd1 = new MNCStudent("Will");
		mstd1.calculateAttendance();
		mstd1.calculateScore();
		
		PaidStudent pstd1 = new PaidStudent("John");
		pstd1.calculateScore();
		
		StudentList studList = new StudentList();
		studList.addStudent(pstd);
		studList.addStudent(mstd);
		studList.addStudent(astd);
		ArrayList<Student> list = studList.getStudents();
		for(Student stud:list)
		{
			stud.goToClass();
			stud.calculateGPA();
			stud.goToClass("go");
			stud.getAvg();
			stud.setAvg(10, 20,30);	
		}
		
	}

}
