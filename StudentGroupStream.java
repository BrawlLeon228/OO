import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroupStream implements Iterable<StudentGroup>, Comparable<StudentGroupStream>{
    private List<StudentGroup> studentGroupList;

    

    public StudentGroupStream() {
        this.studentGroupList = new ArrayList<>();
    }

    public StudentGroupStream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }
    public void add(StudentGroup studentGroup) {
        studentGroupList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupStreamIterator(this);
    }

    @Override
    public int compareTo(StudentGroupStream o) {
        if (studentGroupList.size() > o.getStudentGroupList().size())
            return 1;
        else if (studentGroupList.size() < o.getStudentGroupList().size())
            return -1;
        else
            return 0;
    }
    
    @Override
    public String toString() {
        return "Поток: " + studentGroupList.toString() + "\n";
    }
    // @Override
    // public int compareTo(StudentGroupStream o) {
    //     if (studentGroupList.size() > o.getStudentGroupList().size()){
    //         return 1;
    //     }
    //     else if (studentGroupList.size() < o.getStudentGroupList().size()){
    //         return -1;
    //     }
    //     else
    //         return 0;
    // }
    
    
    

}
