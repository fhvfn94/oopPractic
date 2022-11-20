public class Cat {
    String name;
    int age;

    Cat(String name) {
        this.name = name;
        age = 1;
    }
    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void meow() {
        System.out.println("meow");
        System.out.println("Меня зовут " + name);
        System.out.println("возраст " + age);
    }
}
