import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SweetB {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner sc = new Scanner(new File("SweetB1.txt"))) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
    }
}