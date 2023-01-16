package animals;


public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void eat() {
        System.out.println("I can eat");
    }

    public abstract void go();

    public void sleep() {
        System.out.println("I can sleep");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Animal";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
    }
}
