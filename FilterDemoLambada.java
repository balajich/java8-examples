import java.io.File;
import java.io.FileFilter;;

/**
 * Identify Java files in a directory
 */
public class FilterDemoLambada {
    public static void main(String[] args) {
        // Using Lambda expressions
        FileFilter filterLambada = (File f) -> f.getName().endsWith(".java");
        File dir = new File("/home/mario/java8-examples");
        File[] files = dir.listFiles(filterLambada);
        for (File f : files) {
            System.out.println(f.getName());
        }

    }
}