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

        Car lada = new Car("Lada", "Granta", 2015,"желтого","России",1.7d);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германии", "черный", 3.0);
        Car bmw = new Car("BMW", "Z8", 2021, "черный", "Германии", 3.0);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "красный", "Южной Корее", 2.4d);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "оранжевый", "Южной Корее", 1.6d);
        System.out.println(lada.toString());
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
        System.out.println(kia.toString());
        System.out.println(hyundai.toString());
    }
}