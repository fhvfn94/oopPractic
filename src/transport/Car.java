package transport;

public class Car {
    public static class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            if ((remoteEngineStart != null || !remoteEngineStart.isBlank() || !remoteEngineStart.isEmpty()) && (keylessAccess != null || !keylessAccess.isBlank() || !keylessAccess.isEmpty())) {
                this.remoteEngineStart = remoteEngineStart;
                this.keylessAccess = keylessAccess;
            }
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }
    }
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "Введите значение";
        }
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "Введите значение";
        }
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
        this.color = color;
        } else {
        this.color = "Введите значение";
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    private String transmission;
    private double engineVolume;
    private String typeBody;
    private String numberOfCar;
    private String wheels;
    private Key key;

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

    public Key getKey() {
        return key;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getYear() + " год выпуска, сборка в " + getCountry() + ", " + getColor() + " цвета, объем двигателя — " + getEngineVolume() + "л." + getTransmission() + " " + getTypeBody() + " " + getNumberOfCar() + " " + getWheels();
    }


}
