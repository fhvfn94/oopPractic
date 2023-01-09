import animals.Cat;
import animals.Cat.Breed;
import animals.Cat.favToy;

public class Main {
    public static void main(String[] args) {
        Breed brShort = new Breed("qwerty", "azxc", "1234zx");
        Cat murzik = new Cat("", 1);
        murzik.setBreed(brShort);
        favToy murzikFavToy  = murzik.new favToy("dfdfd", "dssdsdsd");
        murzik.setToy(murzikFavToy);
        murzik.meow();

        Cat begemot = new Cat("Бегемот", 20);
        begemot.meow();
//        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
//        murzik.addFriend(begemot);
//        System.out.println("У кота " + murzik.getName() + " " + murzik.getFriends().length + " друзей");
//        murzik.friends[0].meow();
        System.out.println(Cat.getCount());

    }
}