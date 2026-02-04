import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        timer.setMinutes(1);
        timer.start();
    }
}