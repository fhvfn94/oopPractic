public class Main {
    public static void main(String[] args) {
        Person maxim = new Person("Максим", 1988, "Минск", "бренд-менеджером");
        Person anya = new Person("Аня", 1993, "Москва", "методистом образовательных программ");
        Person katya = new Person("Катя", 1992, "Калининград", "продакт-менеджером");
        Person artem = new Person("Артем", 1995, "Москва", "продакт-менеджером");
        maxim.answer();
        anya.answer();
        katya.answer();
        artem.answer();
    }
}