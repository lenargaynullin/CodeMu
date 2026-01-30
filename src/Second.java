import java.util.Scanner;
// №2 Дана строка. Выведите в консоль длину этой строки.
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String string = scanner.nextLine();
        System.out.println(string.length());
    }

}
