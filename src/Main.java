public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Lenar");
        person.setAge(18);
        System.out.println(person);
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}