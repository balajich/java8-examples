import java.io.File;
import java.io.FileFilter;;

/**
 * Identify Java files in a directory
 */
public class FilterDemo {
    public static void main(String[] args) {
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.getName().endsWith(".java");
            }
        };
        File dir = new File("/home/mario/java8-examples");
        File[] files = dir.listFiles(filter);
        for (File f : files) {
            System.out.println(f.getName());
        }

    }
}