package structural.filter;

public class Person {

    private String name;
    private String gender;
    private String martialStatus;

    public Person(String nm, String gen, String ms) {
        name = nm;
        gender = gen;
        martialStatus = ms;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return martialStatus;
    }

}