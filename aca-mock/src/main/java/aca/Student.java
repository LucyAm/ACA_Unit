package aca;

import java.util.List;


public class Student 
{ private String uniqueId;
private String title;
private List<String> classes;
private String name;

public Student(String uniqueId,
            String title,
            List<String> classes,
            String name){

  this.uniqueId = uniqueId;
  this.title = title;
  this.classes = classes;
  this.name = name;

}

public String getUniqueId() {
  return uniqueId;
}

public String getTitle() {
  return title;
}

public List<String> getClasses() {
  return classes;
}




public String getName() {
  return name;
}
}
