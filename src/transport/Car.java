package transport;

public class Car extends transport {
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

    private String transmission;
    private double engineVolume;
    private String typeBody;
    private String numberOfCar;
    private String wheels;
    private Key key;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume, String transmission, String typeBody, String numberOfCar, String wheels) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = engineVolume;
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

    public double getEngineVolume() {
        return engineVolume;
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



}
