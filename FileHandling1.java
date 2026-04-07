import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class FileHandling1 {
    public static void main(String[] args)
    {
        List<String> lines=Arrays.asList("Hello, Java File Handling!",
            "Line 2: Learning NIO",
            "Line 3: Java 8+ is powerful");

            System.out.println(lines);

            try{
                Path fPath=Paths.get("D:\\dynamoDB\\Output.txt");
                Files.write(fPath, lines);
               System.out.println("File has been written successfully :"); 
                           }
            catch(IOException e)
            {
e.printStackTrace();
            }
    }
    
}
