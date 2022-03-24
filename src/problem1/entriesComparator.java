package problem1;
import java.util.*;
import java.util.Comparator;

public class entriesComparator implements Comparator<Map.Entry<String, Student>> {
    public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
        if(o1.getValue().getMarks() > o2.getValue().getMarks()) {
            return 1;
        } else {
            return -1;
        }
    }
}
