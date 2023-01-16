package animals;

import java.util.Objects;

public class Predator extends Mammal {
    private String typeOfFood;

    public Predator(String name, int age, String habitat, double speed, String typeOfFood) {
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
    public void eat() {
        System.out.println(" i like hunt");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return typeOfFood.equals(predator.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }
}
