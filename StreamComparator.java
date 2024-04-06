import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroupStream>{

    @Override
    public int compare(StudentGroupStream o1, StudentGroupStream o2) {
        if (o1.getStudentGroupList().size() > o2.getStudentGroupList().size()) {
            return 1;
        }
        else if (o2.getStudentGroupList().size() > o1.getStudentGroupList().size()) {
            return 1;
        }
        else {
            return 0;
        }
    }
    
}
