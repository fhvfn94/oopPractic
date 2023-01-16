package animals;

public abstract class Bird extends Animal {
    private String habitat;

    public Bird(String name, int age, String habitat, double speed) {
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

    public abstract void move();

}
