package animals;

import java.time.LocalDate;

public class Cat {
    public static int count;

    public static int getCount() {
        return count;
    }

    public static class Breed {
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
    public class BestToy{
        private String name;
        private String type;

        public BestToy(String name, String type) {
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
    private int yearBirth;
    private Breed breed;
    private BestToy bestToy;

    public Cat(String name) {
        this(name, 0);
    }
    public Cat(String name, int age) {
        this.name = name;
        if (age >= 0) {
            this.yearBirth = LocalDate.now().getYear() - age;
        } else {
            this.yearBirth = LocalDate.now().getYear() - Math.abs(age);
        }
        count++;
    }

    public void meow() {
        System.out.println("meow");
        System.out.println("Меня зовут " + getName());
        System.out.println("возраст " + getAge());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearBirth;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        if (breed == null) {
            this.breed = breed;
        }

    }

    public BestToy getBestToy() {
        return bestToy;
    }

    public void setBestToy(BestToy bestToy) {
        this.bestToy = bestToy;
    }
}
