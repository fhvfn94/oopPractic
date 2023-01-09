package animals;

import java.time.LocalDate;
import java.util.Arrays;

public class Cat {
    private static int count;
    public static class Breed{
        private String name;
        private String country;
        private String hairType;

        public Breed(String name, String country, String hairType) {
            this.name = name;
            this.country = country;
            this.hairType = hairType;
        }
        public String getName() {
            return name;
        }
        public String getCountry() {
            return country;
        }
        public String getHairType() {
            return hairType;
        }
    }

    public class favToy {
        private String name;
        private String type;

        public favToy(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public String getType() {
            return type;
        }
    }
    private String name;
    private int birthYear;
    Cat[] friends;
    private Breed breed;
    private favToy toy;
    public Cat(String name) {
        this(name, 0);
    }
    public Cat(String name, int age) {
        this.setName(name);
        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
        friends = new Cat[0];
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Кот";
        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }
    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (breed == null) {
        this.breed = breed;
        }
    }

    public static int getCount() {
        return count;
    }

    public favToy getToy() {
        return toy;
    }

    public void setToy(favToy toy) {
        this.toy = toy;
    }

    public void meow() {
        System.out.println("Мяу!");
        System.out.println("Меня зовут " + name);
        System.out.println("мне " + getAge() + " лет");
    }

    Cat[] getFriends() {
        if (friends == null) {
            friends = new Cat[0];
        }
        return friends;
    }
    void addFriend(Cat friend) {
        this.friends = Arrays.copyOf(getFriends(), getFriends().length + 1);
        this.friends[this.friends.length - 1] = friend;
    }
}
