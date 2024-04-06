import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("1", "1", 0);
        Student student2 = new Student("1", "1", 1);
        Student student3 = new Student("1", "1", 2);

        Student student4 = new Student("2", "2", 0);
        Student student5 = new Student("2", "2", 1);
        Student student6 = new Student("2", "2", 2);

        Student student7 = new Student("3", "3", 0);
        Student student8 = new Student("3", "3", 1);
        Student student9 = new Student("3", "3", 2);

        StudentGroup studentGroup1 = new StudentGroup();
        studentGroup1.add(student1);
        studentGroup1.add(student2);
        studentGroup1.add(student3);

        StudentGroup studentGroup2 = new StudentGroup();
        studentGroup2.add(student4);
        studentGroup2.add(student5);
        studentGroup2.add(student6);

        StudentGroup studentGroup3 = new StudentGroup();
        studentGroup3.add(student7);
        studentGroup3.add(student8);
        studentGroup3.add(student9);

        StudentGroupStream studentGroupStream1 = new StudentGroupStream();
        studentGroupStream1.add(studentGroup1);
        studentGroupStream1.add(studentGroup2);

        StudentGroupStream studentGroupStream2 = new StudentGroupStream();
        studentGroupStream2.add(studentGroup3);
        
        List<StudentGroupStream> studentGroupStreams = new ArrayList<>();
        studentGroupStreams.add(studentGroupStream1);
        studentGroupStreams.add(studentGroupStream2);


        StreamService service = new StreamService(studentGroupStreams);
        System.out.println(studentGroupStreams);
        System.out.println(service.getSorteStudendGroups());
        
    }
}
