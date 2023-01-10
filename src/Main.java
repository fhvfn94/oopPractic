import transport.Car;
import transport.Car.Key;
import transport.train;
import transport.transport;
import transport.bus;

public class Main {
    public static void main(String[] args) {
        Key key = new Key("dsdsd", "dgdfg");
        // не понимаю как вызвать в методе туСтринг вдложенный класс кей?
        Person maxim = new Person("", 1988, "Минск", "бренд-менеджером");
        Person anya = new Person("Аня", 1993, "Москва", "методистом образовательных программ");
        Person katya = new Person("Катя", 1992, "Калининград", "продакт-менеджером");
        Person artem = new Person("Артем", 1995, "Москва", "продакт-менеджером");
        maxim.setName(null);
        maxim.answer();
        anya.answer();
        katya.answer();
        artem.answer();

        Flower rose = new Flower("", "Голандии", 35.59, 1);
        System.out.println(rose.toStringRose());

        train lasochka = new train("Ласточка", "B-901", 2011, "России", "green", 301, 3500, 10, "Белорусского вокзала", "Минск-Пассажирский", 11);
        System.out.println("Поезд, " + lasochka.getBrand() + " модель " + lasochka.getModel() + " , " + lasochka.getYear() + " год выпуска в " + lasochka.getCountry() + ", скорость передвижения — " + lasochka.getMaxSpeed() + " км/ч, отходит от " + lasochka.getStartPoint() + " и следует до станции " + lasochka.getFinishPoint() + ". Цена поездки — " + lasochka.getCostWay() + " рублей, в поезде " + lasochka.getRailwayCarriage() + " вагонов.");

        train leningrad = new train("Ленинград", "D-125", 2019, "России", "green", 270, 1700, 10, "Ленинградского", "Ленинград-Пассажирский", 8);
        System.out.println("Поезд, " + leningrad.getBrand() + " модель " + leningrad.getModel() + " , " + leningrad.getYear() + " год выпуска в " + lasochka.getCountry() + ", скорость передвижения — " + leningrad.getMaxSpeed() + " км/ч, отходит от " + leningrad.getStartPoint() + " вокзала и следует до станции " + leningrad.getFinishPoint() + ". Цена поездки — " + leningrad.getCostWay() + " рублей, в поезде " + leningrad.getRailwayCarriage() + " вагонов.");


        bus bus = new bus("Паз", "древность", 1966, "Россия", "белый", 500, 10, "Джеймс Леброн", "А215ЕЕ/22");
        bus.name();
    }
}