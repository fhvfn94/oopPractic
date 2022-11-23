public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            this.flowerColor = "white";
        } else {
            this.flowerColor = flowerColor;
        }
        if (null == country || country.isEmpty() || country.isBlank()) {
            this.country = "russia";
        } else {
            this.country = country;
        }
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 1;
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()) {
            this.flowerColor = "white";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (null == country || country.isEmpty() || country.isBlank()) {
            this.country = "russia";
        } else {
            this.country = country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
    }

    public String toStringRose() {
        return "Роза обыкновенная из " + getCountry() + " , стоймость штуки - " + getCost() + " рублей.";
    }

    public String toStringHrizantema() {
        return "Хризантема стоймость штуки - " + getCost() + " рублей, срок стояния - " + lifeSpan + " дней";
    }

    public String toStringPion() {
        return "Пион из " + getCountry() + ", стоймость штуки - " + getCost() + " рублей, срок стояния - " + lifeSpan + "дней";
    }
    public String toStringGipsofila() {
        return "Гипсофила, страна происхождения — " + getCountry() +" , стоимость штуки — " + getCost() + " рублей, срок стояния — " + lifeSpan + " дней.";
    }
}
