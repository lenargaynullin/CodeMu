import java.util.Scanner;

// №4 Дано число. Проверьте, четное оно или нет.
public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        }
        else {
            System.out.println(number + " is odd");
        }
    }
}
