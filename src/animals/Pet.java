package animals;

import java.time.LocalDate;

public class Pet {
    private String name;
    private int birthYear;

    private String address;
    private String phone;

    public void talk() {

    }

    public void eat() {

    }

    public Pet(String name) {
        this(name, 0);
    }

    public Pet(String name, int age) {
        setName(name);
        if (age >= 0) {
            this.birthYear = LocalDate.now().getYear() - age;
        } else {
            this.birthYear = LocalDate.now().getYear() - Math.abs(age);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank() && !name.isEmpty()) {
            this.name = name;
        } else {
            this.name = "Домашнее животное";
        }
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
