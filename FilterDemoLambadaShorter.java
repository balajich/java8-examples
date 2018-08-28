import java.io.File;
import java.io.FileFilter;

/**
 * Identify Java files in a directory
 */
public class FilterDemoLambadaShorter {
    public static void main(String[] args) {
        // Using Lambda expressions
        File dir = new File("/home/mario/java8-examples");
        File[] files = dir.listFiles((File file)-> file.getName().endsWith(".java"));
        for (File f : files) {
            System.out.println(f.getName());
        }

    }
}