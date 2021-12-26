package tp2;

import java.util.Scanner;

public class ISIGame {

    static class ISIException extends RuntimeException{
        public ISIException(String s) {
            super(s);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try {
            if (line.toLowerCase().contains("isi"))
            System.out.println("Life is not isi");
            else
                throw new ISIException(line);
        } catch(ISIException e){
            System.out.printf("ok");
        }
    }
}
