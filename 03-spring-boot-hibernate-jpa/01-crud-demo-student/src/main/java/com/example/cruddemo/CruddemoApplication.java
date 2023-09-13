package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDao;
import com.example.cruddemo.entity.Student;
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
	public CommandLineRunner commandLineRunner(StudentDao thestudentDao){
		return  runner ->{
			//createStudent(thestudentDao);

			createMultipleStudents(thestudentDao);
		};
	}

	private void createMultipleStudents(StudentDao thestudentDao) {
		System.out.println("Creating new student object....");
		Student tempStudent1 = new Student("vital","pandu","pandu.y13@gmail.com");
		Student tempStudent2 = new Student("john","pandu","pandu.y13@gmail.com");
		Student tempStudent3 = new Student("meery","pandu","pandu.y13@gmail.com");

		//save the student object
		System.out.println("Saving the student ......");
		thestudentDao.save(tempStudent1);
		thestudentDao.save(tempStudent2);
		thestudentDao.save(tempStudent3);



	}

	private void createStudent(StudentDao studentDao){

		//create student object
		System.out.println("Creating new student object....");
		Student tempStudent = new Student("vital","pandu","pandu.y13@gmail.com");

		//save the student object
		System.out.println("Saving the student ......");
		studentDao.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved student, Generated Id: "+ tempStudent.getId());


	}

}
