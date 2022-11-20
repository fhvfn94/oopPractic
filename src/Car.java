public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, int year, String color,  String country, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return brand + model + ", " + year + " год выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя — " + engineVolume + "л.";
    }
}
