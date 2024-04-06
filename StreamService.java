import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService{
    private List<StudentGroupStream> studendGroupStreams;

    public StreamService(List<StudentGroupStream> studentGroupStreams) {
        this.studendGroupStreams = studentGroupStreams;
    }

    public List<StudentGroupStream> getStudendGroupStreams() {
        return studendGroupStreams;
    }
    
    public List<StudentGroupStream> getSorteStudendGroups() {
        List<StudentGroupStream> newList= new ArrayList<>(studendGroupStreams);
        Collections.sort(newList);
        return newList;
    }
    
}
