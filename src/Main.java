public class Main {
    public static void main(String[] args) {
        Cat a = new Cat();
        a.age = 2;
        a.name = "Anton";
        a.meow();

        Cat b = new Cat();
        b.name = "Andrey";
        b.age = 45;
        b.meow();
    }
}