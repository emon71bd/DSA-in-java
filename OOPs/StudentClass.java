package OOPs;
import java.util.*;
public class StudentClass {
    public static void main(String[] args) {

//        Student.numOfStudents = 100;
        System.out.println(Student.getNumOfStudents());

        Student s1 = new Student("Emon", 28, 92.5);
        Student s2 = new Student("Tawrath", 1, 95.85);
        Student s3 = new Student("Anas", 16, 75.65);

        System.out.println(s1.getNumOfStudents());
        System.out.println(s2.getNumOfStudents());
        System.out.println(s3.getNumOfStudents());
    }
}
