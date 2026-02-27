package filehandling;

import java.io.IOException;
import java.nio.file.*;
import java.util.stream.Stream;

public class DirectoryWalker {

    public static void main(String[] args) {
        Path startPath = Paths.get("C:\\Users\\kavyaramalingesh\\OneDrive\\Desktop\\Javaweek2\\src"); // change this

        try {
            walkDirectory(startPath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void walkDirectory(Path path) throws IOException {

        if (Files.isDirectory(path)) {
            try (Stream<Path> paths = Files.list(path)) {
                paths.forEach(p -> {
                    try {
                        walkDirectory(p);  // Recursive call
                    } catch (IOException e) {
                        System.out.println("Error reading: " + p);
                    }
                });
            }
        } else {
            long size = Files.size(path);
            System.out.println("File: " + path.toAbsolutePath() + " | Size: " + size + " bytes");
        }
    }
}

