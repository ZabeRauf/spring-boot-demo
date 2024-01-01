package com.zoobenmcdooben.cruddemo;

import com.zoobenmcdooben.cruddemo.dao.StudentDAO;
import com.zoobenmcdooben.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			//createMultipleStudents(studentDAO);
			readStudent(studentDAO);
		};
	}

	private void readStudent(StudentDAO studentDAO) {
		// create a student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Vincent", "Beggs", "midnightclub@email.com");

		// save the student ot the db
		System.out.println("Saving students to database...");
		studentDAO.save(tempStudent);

		// display that students id
		int studentID = tempStudent.getId();
		System.out.println("Student saved! Generated ID: " + studentID);

		// retrieve student by id: primary key
		System.out.println("Retrieving the student with ID: " + studentID);
		Student myStudent = studentDAO.findById(studentID);

		// display student
		System.out.println("Student with ID " + studentID + " found. " + myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// create students
		System.out.println("Creating new student objects...");
		Student tempStudent1 = new Student("Rahul", "Kohli", "rkohli@email.com");
		Student tempStudent2 = new Student("Sheriff", "Hassan", "vbeggs@email.com");
		Student tempStudent3 = new Student("Owen", "Kohli", "blymanorstaff@email.com");

		// save the students
		System.out.println("Saving students to database...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		// display ids
		System.out.println("Student saved! Generated ID: " + tempStudent1.getId());
		System.out.println("Student saved! Generated ID: " + tempStudent2.getId());
		System.out.println("Student saved! Generated ID: " + tempStudent3.getId());
	}

	private void createStudent(StudentDAO studentDAO) {
		// create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Sheriff", "Hassan", "sherrif@email.com");
		// save the student object
		System.out.println("Saving student to database...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Student saved! Generated ID: " + tempStudent.getId());

	}

}
