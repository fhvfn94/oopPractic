public class Person {
    String name;
    int yearOfBirth;
    String town;

    Person(String name, int yearOfBirth, String town) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
    }

    void answer() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town +  " Я родился в " + yearOfBirth + " году. Будем знакомы!");
    }
}
