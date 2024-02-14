package EmployeeSample;
import java.util.ArrayList;

import oopSamples.Student;
import oopSamples.StudentList;
public class EmpDriver {
	public static void main(String[] args) {
		Emp m=new Manager("anand","chennai",70000,"manager");
		
		
		Emp d = new Developer("anu","calcutta",60000,"developer");
		Emp p = new Programmer("sharu","coimbatore",40000,"programmer");
		EmpList EmpList = new EmpList();
		EmpList.addEmp(d);
		EmpList.addEmp(p);
		EmpList.addEmp(m);
		ArrayList<Emp> list = EmpList.getEmp();
		for(Emp empl:list)
		{
			empl.calculateBonus(70000);
			
			empl.managingProject();
			empl.performanceReport();
		}
		
	
	}
}
