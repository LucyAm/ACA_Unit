package aca;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class QEStudentsTest {
	
	 private static QEStudents mockedQEStudents;
	  private static Student student1;
	  private static Student student2;
	 
	  @BeforeClass
	  public static void setUp(){
	    mockedQEStudents = mock(QEStudents.class);
	    student1 = new Student("1","bachelor",
	            Arrays.asList("Java" ,"Linux"),"Armen" );
	 
	    student2 =  new Student("2" ,"master",
	            Arrays.asList("C++" ,"Linux"),"Karen" );
		 
	    when(mockedQEStudents.getAllStudents()).thenReturn(Arrays.asList(student1, student2));
	    when(mockedQEStudents.getStudent("1")).thenReturn(student1);
	    when(mockedQEStudents.addStudent(student1)).thenReturn(student1.getUniqueId());
	 
	    when(mockedQEStudents.updateStudent(student1)).thenReturn(student1.getUniqueId());
	 
	  }
	 
	  @Test
	  public void testGetAllStudents() throws Exception {
	 
	    List<Student> allStudents = mockedQEStudents.getAllStudents();
	    assertEquals(2, allStudents.size());
	    Student stud1 = allStudents.get(0);
	    assertEquals("1", stud1.getUniqueId());
	    assertEquals("bachelor", stud1.getTitle());
	    assertEquals(2, stud1.getClasses().size());
	    assertEquals("Armen", stud1.getName());
	  }
	 
	 
}
