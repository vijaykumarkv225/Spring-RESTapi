package Microservices.com.SpringRESTapi.studentController;

import Microservices.com.SpringRESTapi.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyStudent {

    //http://localhost:8080/student

    @GetMapping("/student")
    public Student getStudent(){
        Student student = new Student(1,"vijay","kumar");

        return student;
    }
    //http://localhost:8080/students
    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "sume", "latha"));
        students.add(new Student(2, "ravi", "kumar"));
        students.add(new Student(3, "manu", "patil"));
        students.add(new Student(4, "raju", "bhai"));
        students.add(new Student(5,"ramu","kumar" ));

        return students;
    }




}
