import java.util.concurrent.TimeUnit;

public class Timer {
    // Поля класса
    private int seconds;
    private int minutes;

    // Конструктор


    // Геттеры, сеттеры
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public void start() throws InterruptedException {
        for (int i = seconds + minutes * 60; i >= 0; i--) {
            if (i % 60 == 0) {
                System.out.println(i / 60 + ":00");
            } else if (i % 60 < 10 && i > 0) {
                System.out.println(i / 60 + ":0" + i % 60);
            } else
                {
                System.out.println(i / 60 + ":" + i % 60);
                }
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Time out");
    }
}
