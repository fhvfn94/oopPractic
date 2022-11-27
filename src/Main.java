import animals.Cat;
import animals.Cat.Breed;

public class Main {
    public static void main(String[] args) {
        Breed bp = new Breed("dfdf", "fdfd", "dfdf");
        Cat a = new Cat("Anton", 2);
        a.setBreed(bp);
        a.meow();
        Cat.BestToy bestToy = a.new BestToy("dsd", "sdfsdf");
        a.setBestToy(bestToy);
        System.out.println(a.getBestToy());

        Cat b = new Cat("Andrey", 12);
        b.meow();

        System.out.println(Cat.getCount());
        System.out.println(bp.getCountry());
    }
}