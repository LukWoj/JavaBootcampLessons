import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;


public class FileExample {
    public static void main(String[] args) {

        Path homeDir = Paths.get("G:", "Programowanie", "BOOTCAMP live", "WeekVII", "lifecode", "fileexample");

        //readFileJava8(homeDir);
        //readFileJava7(homeDir);
        readFileRelativePath();
    }


    private static void readFileRelativePath() {
        Path resourcePath = Paths.get("src", "main", "resources");
        Path configPath = resourcePath.resolve("config.csv");

        try {
            Files.readAllLines(configPath)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //This is effective way to read very big files
    //try with resources
    private static void readFileJava7(Path homeDir) {
        Path pathToFile = homeDir.resolve("test.txt");

        try (BufferedReader bufferedReader = Files.newBufferedReader(pathToFile)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.printf("There was problem with file %s%n", pathToFile.toAbsolutePath());
        }
    }

    private static void readFileJava8(Path homeDir) {
        Path pathToFile = homeDir.resolve("test.txt");
        try {
            Files.readAllLines(pathToFile)
                    .forEach(FileExample::print);
        } catch (IOException e) {
            System.out.printf("There was problem with file %s%n", pathToFile.toAbsolutePath());
        }
    }


    //fileReader and BufferedReader

    private static void readFileJava6(File fileToFile) {
        Reader fileReader = null;
        BufferedReader reader = null;
        try {

            fileReader = new FileReader(fileToFile);
            reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static void print(String toPrint) {
        System.out.println(toPrint);
    }
}
