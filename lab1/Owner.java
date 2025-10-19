package lab1;

public class Owner {
    private String name;
    private String surname;
    private Date birthdate;

    public Owner() {
        this.name = "";
        this.surname = "";
        this.birthdate = new Date();
    }

    public Owner(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void printInfo() {
        System.out.println("Owner: " + name + " " + surname);
        System.out.print("Birthdate: ");
        birthdate.printInfo();
    }
}

