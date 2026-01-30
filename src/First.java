import java.util.Scanner;

// Уровень 1.1 задачника Java
// №1 Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.
public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Negative number");
        }
    }
}
