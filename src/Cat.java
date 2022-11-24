import java.time.LocalDate;

public class Cat {
    String name;
    int yearBirth;

    Cat(String name) {
        this(name, 0);
    }
    Cat(String name, int age) {
        this.name = name;
        if (age >= 0) {
            this.yearBirth = LocalDate.now().getYear() - age;
        } else {
            this.yearBirth = LocalDate.now().getYear() - Math.abs(age);
        }
    }

    void meow() {
        System.out.println("meow");
        System.out.println("Меня зовут " + getName());
        System.out.println("возраст " + getAge());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return LocalDate.now().getYear() - yearBirth;
    }
}
