package transport;

public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int year;
    private final String country;
    private String transmission;
    private String typeBody;
    private String numberOfCar;
    private String wheels;

    public Car(String brand, String model, int year, String color,  String country, double engineVolume, String transmission, String typeBody, String numberOfCar, String wheels) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
        this.transmission = transmission;
        this.typeBody = typeBody;
        if (numberOfCar == null || numberOfCar.isEmpty() || numberOfCar.isBlank()) {
            this.numberOfCar = "x000xx00";
        } else {
            this.numberOfCar = numberOfCar;
        }
        if (wheels == null || wheels.isEmpty() || wheels.isBlank()) {
            this.wheels = "сезонная";
        } else {
            this.wheels = wheels;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        if (numberOfCar == null || numberOfCar.isEmpty() || numberOfCar.isBlank()) {
            this.numberOfCar = "x000xx00";
        } else {
            this.numberOfCar = numberOfCar;
        }
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        if (wheels == null || wheels.isEmpty() || wheels.isBlank()) {
            this.wheels = "сезонная";
        } else {
            this.wheels = wheels;
        }
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, сборка в " + getCountry() + ", " + getColor() + " цвета, объем двигателя — " + getEngineVolume() + "л." + getTransmission() + " " + getTypeBody() + " " + getNumberOfCar() + " " + getWheels();
    }
}
