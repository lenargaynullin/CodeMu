//№5 Даны два слова. Проверьте, что первые буквы этих слов совпадают.
import java.util.Scanner;
public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first word");
        String first = scanner.nextLine();
        System.out.println("Enter the second word");
        String second = scanner.nextLine();
        if (first.charAt(0) == second.charAt(0)) {
            System.out.println("The first letters are the same");
        }
        else {
            System.out.println("The first letters don't match");
        }
    }
}
