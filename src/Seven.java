// Дано целое число. Выведите в консоль последнюю цифру этого числа.
public class Seven {
    public static void main(String[] args) {
        int number = -123456;
        System.out.println(Math.abs(number%10));
    }
}
