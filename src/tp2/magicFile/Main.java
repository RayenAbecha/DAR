package tp2.magicFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Give me your file name :)");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        printFileContent(fileName);
    }
    private static String getFileContent(String fileName) {
        File file = new File("src\\tp2\\magicFile\\" + fileName);
        try {
            Scanner reader = new Scanner(file);
            String content = reader.nextLine();
            return content;
        }catch (FileNotFoundException e){
            System.out.println("file not found :/");
        }catch (NoSuchElementException e){
            System.out.println("File is empty :/");
        }
        return null;
    }
    private static void printFileContent(String fileName) {
        String data = getFileContent(fileName);
        if (data!=null) System.out.println(data);
    }
}
