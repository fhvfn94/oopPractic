public class Person {
    String name;
    int yearOfBirth;
    String town;
    //второе задание
    String jobTitle;

    Person(String name, int yearOfBirth, String town, String jobTitle) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    void answer() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town +  " Я родился в " + yearOfBirth + " году. Я работаю " + jobTitle + " Будем знакомы!");
    }
}
