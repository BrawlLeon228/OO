

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private Integer studentId;
    
    public Student(String name, String surname, Integer studentId) {
        this.name = name;
        this.surname = surname;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return surname + " " + name + ": " +studentId;
    }

    @Override
    public int compareTo(Student o) {
        if (o.getStudentId() > studentId) {
            return -1;
        }
        else if (o.getStudentId() < studentId) {
            return 1;
        }
        else {
            return 0;
        }
    }

    
    
    
    
}
