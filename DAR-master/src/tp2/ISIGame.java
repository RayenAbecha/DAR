package tp2;
import java.util.Scanner;

public class ISIGame {

    static class ISIException extends RuntimeException{
        public ISIException(String s) {
            super(s);
        }

        public ISIException() {

        }
    }


    public static void main(String[] args) {
        System.out.println("Enter a word");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line.toUpperCase();
        try
        {
            if(line.contains("ISI"))
            {
                throw new ISIException();
            }
            System.out.println("OK");
        }
        catch(ISIException ex)
        {
            System.out.println("Life is not isi");
        }

    }
}
