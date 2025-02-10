
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SweetB2 {
    public static void main(String[] args) throws FileNotFoundException{
        List<String> students = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("SweetB2.txt"))) {
            while (sc.hasNextLine()) {
            students.add(sc.nextLine());
            } 
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }
        }
    }
}