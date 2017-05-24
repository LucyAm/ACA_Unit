package aca;

import java.util.Collections;
import java.util.List;

public class QEStudents {

	private static QEStudents students = new QEStudents();
	 
	  public List<Student> getAllStudents(){
	      return Collections.EMPTY_LIST;
	  }
	 
	  public Student getStudent(String uniqueId){
	      return null;
	  }
	 
	  public String addStudent(Student stud){
	      return stud.getUniqueId();
	  }
	 
	  public String updateStudent(Student stud){
	      return stud.getUniqueId();
	  }
	 
	  public static QEStudents getInstance(){
	      return students;
	  }
}