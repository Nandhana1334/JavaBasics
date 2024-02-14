package EmployeeSample;
//
//public class EmpList {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

import java.util.ArrayList;

public class EmpList {

	ArrayList<Emp> EmpList;;
	public EmpList()
	{
		System.out.println("Creating Employee list..");
		EmpList = new ArrayList<>();
	}
	public void addEmp(Emp e)
	{
		System.out.println("Add employee to the list");
		EmpList.add(e);
	}
	public ArrayList getEmp()
	{
		return EmpList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

