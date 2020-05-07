package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ask how many new students we want to add
		System.out.println("Enter number of students to enroll: ");
		Scanner src = new Scanner(System.in);
		int numOfStudents = src.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create n number of new students
		for(int i = 0; i < numOfStudents; i++)
		{
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].toString());

		}

	}

}
