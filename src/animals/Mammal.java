package animals;

public abstract class Mammal extends Animal {
    private String habitat;
    private double speed;

    public Mammal(String name, int age, String habitat, double speed) {
        super(name, age);
        this.setHabitat(habitat);
        this.setSpeed(speed);
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

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            this.speed = Math.abs(speed);
        }
    }


    @Override
    public void go() {
        System.out.println("I can walk");
    }

    public abstract void eat();

}
