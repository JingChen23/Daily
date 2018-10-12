import java.util.HashSet;
import java.util.Set;

public class MemoryLeakTest {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        Student student1 = new Student(1001, "Adam");
        Student student2 = new Student(1002, "Bob");
        Student student3 = new Student(1001, "Adam");
        studentSet.add(student1);
        studentSet.add(student2);

        System.out.println(studentSet.size());
        System.out.println(student1.hashCode());
        student1.setName("Jack");
        System.out.println(student1.hashCode());
        studentSet.remove(student1);
//        studentSet.remove(student1);
        System.out.println(studentSet.size());
        System.out.println(studentSet.toString());

        System.out.println(student1.equals(student3));



    }
}
