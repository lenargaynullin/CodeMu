import java.util.Scanner;

// №3 Дана строка. Выведите в консоль последний символ строки.
public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string ");
        String s = scanner.nextLine();
        System.out.println(s.charAt(s.length()-1));
    }
}
