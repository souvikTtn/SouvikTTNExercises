package CollectionsAndDates.Question5;
/*Write a program to sort the Student objects based on Score ,
        if the score are same then sort on First Name . Class Student{ String Name; Double Score; Double Age*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("souvik",24d,500d);
        Student s2=new Student("deepak",23d,200d);
        Student s3=new Student("deepika",26d,500d);
        Student s4=new Student("dhruv",27d,500d);
        Student s5=new Student("subham",22d,200d);

        List<Student> students=new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        //sorting
       Collections.sort(students,new MyComparator());
       for (Student student:students){
           System.out.println(student.getName()+" "+student.getAge()+" "+student.getScore());
       }

    }
}
