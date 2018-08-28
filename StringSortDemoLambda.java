import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortDemoLambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("***", "*", "**", "****");
        Collections.sort(list, (String o1, String o2)-> o1.compareTo(o2));
        for (String string : list) {
            System.out.println(string);
        }
    }

}