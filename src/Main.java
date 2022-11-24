import transport.Car;

public class Main {
    public static void main(String[] args) {
        Person maxim = new Person("", 1988, "Минск", "бренд-менеджером");
        Person anya = new Person("Аня", 1993, "Москва", "методистом образовательных программ");
        Person katya = new Person("Катя", 1992, "Калининград", "продакт-менеджером");
        Person artem = new Person("Артем", 1995, "Москва", "продакт-менеджером");
        maxim.setName(null);
        maxim.answer();
        anya.answer();
        katya.answer();
        artem.answer();

        Car lada = new Car("Lada", "Granta", 2015,"желтого","России",1.7d, "авто", "седан", "", "");
        System.out.println(lada.toString());

        Flower rose = new Flower("", "Голандии", 35.59, 1);
        System.out.println(rose.toStringRose());
    }
}