package oopSamples;
import java.util.ArrayList;

public class StudentList {

	ArrayList<Student> studList;;
	//ArrayList<Integer> s;
	
	public StudentList()
	{
		System.out.println("Creating Students list..");
		studList = new ArrayList<>();
	}
	public void addStudent(Student student)
	{
		System.out.println("Add students to the list");
		studList.add(student);
	}
	public ArrayList getStudents()
	{
		return studList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
