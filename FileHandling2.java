import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.stream.*;

public class FileHandling2 {
    static final String Base_Dir="D:\\dynamoDB\\Java";
    static void CreateAndWriteFile() throws IOException
    {
        System.out.println("\n=== 1. Create & Write File ===");
        Path dir=Paths.get(Base_Dir);
        Files.createDirectories(dir);
        //System.out.println("Directories has been created :");
        Path file=dir.resolve("kcm.txt");

        List<String> lines=Arrays.asList("Custom entities VLM_TEST",
        "VLM_TEST3 VLM5 VLM4were", 
        "created in version 4.7.1. A role named ",
        "roles_for_vlm was also created and ",
        "full permissions were assigned to all ",
        "these entities.",
        "2 When viewing or editing", 
        "the role, no discrepancies were", 
        "observed— all permissions appeared ",
        "correctly in AC");
        Files.write(file, lines, StandardOpenOption.CREATE);
        System.out.println("File has been created and write at the place");



    }
    public static void main(String[] args) throws IOException
    {
CreateAndWriteFile();
    }
    
}
