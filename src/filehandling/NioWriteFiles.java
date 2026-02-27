package filehandling;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class NioWriteFiles {
    public static void main(String[] args){
        Path filePath = Paths.get("example.txt");
        try{
            List<String> lines = new ArrayList<>();

            lines.add("One");
            lines.add("Two");
            lines.add("Three");

            Files.write(filePath,lines);
            System.out.println("Files written successfully");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
