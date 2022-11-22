public class Person {
    String name;
    int yearOfBirth;
    String town;
    //второе задание
    String jobTitle;

    Person(String name, int yearOfBirth, String town, String jobTitle) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if (name == "" || name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == "" || town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == "" || jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    void answer() {
        System.out.println("Привет! Меня зовут " + name + " Я из города " + town +  " Я родился в " + yearOfBirth + " году. Я работаю " + jobTitle + " Будем знакомы!");
    }
}
