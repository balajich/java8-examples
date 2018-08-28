import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortDemo{
    public static void main(String[] args) {
        Comparator<String> comparator= new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        List<String> list= Arrays.asList("***","*","**","****");
        Collections.sort(list,comparator);
        for(String string:list){
            System.out.println(string);
        }
    }
    
}