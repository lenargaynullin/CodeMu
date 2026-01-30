public class Person {
    // Поля класса
    private String name;
    private int age;

    // Конструктор
    public Person() {
        this.name = "Неизвестно";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    // Геттеры, сеттеры
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}