package Linter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Library{
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\STUDENT\\JavaFundemantal401\\Linter\\gates.js");
        System.out.println(ReadFile(path));
    }
    public static String ReadFile(Path newpath) {
        String text_Missing = "";
        String text_Execut = "";

        try {
            List<String> fileLinesArray = Files.readAllLines(newpath);
            int index = 0;
            for (String i : fileLinesArray) {
                if (!i.endsWith(";")) {
                    if (i.isEmpty() || i.endsWith("}") || i.endsWith("{") || i.contains("if") || i.contains("else")) {
                        text_Execut = text_Execut+" "+"Line "+(index+1)+": Not Missing semicolon\n\n";
                    } else {
                        text_Missing = text_Missing +" "+"Line"+(index+1)+": Missing semicolon\n\n";
                    }

                } index++ ;
            }
        } catch (IOException exception) {
            System.out.println("An error occured while rading from file\n\n");
        }
        return text_Missing;
    }
}
