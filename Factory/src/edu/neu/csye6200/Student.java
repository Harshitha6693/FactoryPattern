package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student extends Person implements Comparable<Student>{
	private Double gpa;

	public Student() {
		super();
		this.gpa = 1.0;
	}

	public Student(int id, String firstName, String lastName, int age, double gpa) {
		super(id, firstName, lastName, age);
		this.gpa = gpa;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(super.toString());
		info.append(", is a student having a GPA of: ").append(this.getGpa());
		return info.toString();
	}
	public void demo() {
		System.out.println(toString());
	}
	/**
	 * Implement comparable so that Student can be sorted in natural order(by gpa)
	 */

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.gpa.compareTo(this.gpa);
//		return gpa.compareTo(o.gpa);// use compare to by implementing comparable interface by overriding eclipse interface
	}
	public static void demo1() {
		List<Student> students = new ArrayList<>();
		Student s1 = new Student(1,"abs","cvb",12,2.0);
		Student s2 = new Student(2,"abis","ckvb",10,2.10);
		Student s3 = new Student(3,"abas","acvb",8,3.0);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		Collections.sort(students);
		for(Student s:students) {
			System.out.println(s);
		}
		System.out.println(students +" students in this class");

	}

}
