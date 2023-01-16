package animals;

import java.util.Objects;

public class Flightless extends Bird {
    private String typeOfMove;

    public Flightless(String name, int age, String habitat, double speed, String typeOfMove) {
        super(name, age, habitat, speed);
        this.setTypeOfMove(typeOfMove);
    }

    public String getTypeOfMove() {
        return typeOfMove;
    }

    public void setTypeOfMove(String typeOfMove) {
        if (typeOfMove != null && !typeOfMove.isBlank() && !typeOfMove.isEmpty()) {
            this.typeOfMove = typeOfMove;
        } else {
            this.typeOfMove = "try again";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flightless that = (Flightless) o;
        return typeOfMove.equals(that.typeOfMove);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMove);
    }

    @Override
    public void move() {
        System.out.println("I can walk");
    }
}
