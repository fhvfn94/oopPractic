package transport;

public class bus extends transport {
    private double fuelPercentage;
    private int maxPeople;
    private String nameDriver;
    private String numberBus;
    public bus(String brand, String model, int year, String country, String color, int maxSpeed, int maxPeople, String nameDriver, String numberBus) {
        super(brand, model, year, country, color, maxSpeed);
        this.setMaxPeople(maxPeople);
        this.setNameDriver(nameDriver);
        this.setNumberBus(numberBus);
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        if (maxPeople > 0) {
            this.maxPeople = maxPeople;
        } else {
            this.maxPeople = Math.abs(maxPeople);
        }
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        if (nameDriver != null && !nameDriver.isBlank() && !nameDriver.isEmpty()) {
            this.nameDriver = nameDriver;
        } else {
            this.nameDriver = "try again";
        }
    }

    public String getNumberBus() {
        return numberBus;
    }

    public void setNumberBus(String numberBus) {
        if (numberBus != null && !numberBus.isBlank() && !numberBus.isEmpty()) {
            this.numberBus = numberBus;
        } else {
            this.numberBus = "try again";
        }
    }

    public void name() {
        System.out.println("Привет! Меня зовут" + getNameDriver() + ". Я водитель автобуса " + getBrand() + " модель " + getModel() + " номер " + getNumberBus() + " страна произовдства " + getCountry() + " год выпуска " + getYear() + " цвет " + getColor() + " максимальная скорость км/ч" + getMaxSpeed() + " максимальная вместимость " + getMaxPeople() + " человек");
    }
    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage > 0) {
            this.fuelPercentage = fuelPercentage;
        } else {
            this.fuelPercentage = Math.abs(fuelPercentage);
        }
    }
    @Override
    public double refill() {
        return fuelPercentage;
    }
}
