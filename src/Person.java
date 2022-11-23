public class Person {
    private String name;
    private int yearOfBirth;
    private String town;
    private String jobTitle;

    Person(String name, int yearOfBirth, String town, String jobTitle) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "maga";
        } else {
            this.name = name;
        }
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            Math.abs(this.yearOfBirth);
        }
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Astana";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            this.jobTitle = "web developer";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || !name.isBlank()) {
            this.name = "maga";
        } else {
            this.name = name;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            Math.abs(this.yearOfBirth);
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Astana";
        } else {
            this.town = town;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            this.jobTitle = "web developer";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    void answer() {
        System.out.println("Привет! Меня зовут " + getName() + " Я из города " + getTown() +  " Я родился в " + getYearOfBirth() + " году. Я работаю " + getJobTitle() + " Будем знакомы!");
    }
}