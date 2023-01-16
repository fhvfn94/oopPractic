package animals;

import java.util.Objects;

public class Herbivore extends Mammal {
    private String typeOfFood;

    public Herbivore(String name, int age, String habitat, double speed, String typeOfFood) {
        super(name, age, habitat, speed);
        this.setTypeOfFood(typeOfFood);
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        } else {
            this.typeOfFood = "try again";
        }
    }

    @Override
    public void go() {
        System.out.println("I can walk");
    }

    @Override
    public void eat() {
        System.out.println("pasture");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivore herbivore = (Herbivore) o;
        return typeOfFood.equals(herbivore.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }
}
