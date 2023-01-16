package transport;

public abstract class transport {
    private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private int maxSpeed;


    public transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        this.year = year;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isBlank() && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            this.brand = "please try again";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank() && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "please try again";
        }
    }

    public int getYear() {
        return year;
    }


    public String getCountry() {
        return country;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank() && !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "please try again";
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            this.maxSpeed = Math.abs(maxSpeed);
        }
    }

    public abstract double refill();
}
