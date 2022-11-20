public class Main {
    public static void main(String[] args) {
        Person maxim = new Person("Максим", 1988, "Минск");
        Person anya = new Person("Аня", 1993, "Москва");
        Person katya = new Person("Катя", 1992, "Калининград");
        Person artem = new Person("Артем", 1995, "Москва");
        maxim.answer();
        anya.answer();
        katya.answer();
        artem.answer();
    }
}