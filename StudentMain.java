package com.blc.elc;

public class StudentMain {

	public static void main(String[] args) {
		Student stud = new Student();
		stud.setStudentDetails("ABC",101,85.5);
		System.out.println(stud.getStudentDetails());

	}

}
