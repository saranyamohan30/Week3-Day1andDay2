package week3.day1.org.student;

import week3.*;
import week3.day1.org.department.DepartmentClass;

public class StudentClass extends DepartmentClass {

//	Methods   :studentName(),studentDept(),studentId()
	
	public void studentName(String name) {
		System.out.println("Student Name is :"+name);
	}
	public void studentDept(String dept) {
		System.out.println("Department Name : "+dept);
	}
	public void studentId(int id) {
		System.out.println("The Student ID is :"+id);
	}
	public static void main(String[] args) {
		StudentClass student=new StudentClass();
		student.studentName("Hari");
		student.studentId(5);
		student.studentDept("IT");
		DepartmentClass dept=new DepartmentClass();
		dept.deptName("IT");
		dept.collegeCode(025);
		dept.collegeName("Anna University");
		dept.collegeRank(1);
	}
}
