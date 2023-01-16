package animals;

import java.util.Objects;

public class Amphibian extends Animal {
    private String habitat;

    public Amphibian(String name, int age, String habitat) {
        super(name, age);
        this.setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat != null && !habitat.isBlank() && !habitat.isEmpty()) {
            this.habitat = habitat;
        } else {
            this.habitat = "try again";
        }
    }

    @Override
    public void go() {
        System.out.println("I can walk");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibian amphibian = (Amphibian) o;
        return habitat.equals(amphibian.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat);
    }
}
