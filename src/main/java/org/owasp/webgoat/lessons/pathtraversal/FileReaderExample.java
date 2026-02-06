import java.io.File; 
import java.io.IOException;

public class FileReaderExample {

    public static File getFile(String userInput) throws IOException {
        // Intended base directory
        File baseDir = new File("/var/app/data");

        // User-controlled input is directly appended
        File file = new File(baseDir, userInput);

        return file;
    }

    public static void main(String[] args) throws IOException {
        // Example attacker input: "../../etc/passwd"
        File file = getFile(args[0]);
        System.out.println("Accessing: " + file.getCanonicalPath());
    }
} 
