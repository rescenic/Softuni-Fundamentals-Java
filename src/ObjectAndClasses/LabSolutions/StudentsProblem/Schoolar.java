package StudentsProblem;

public class Schoolar {

    private String firstName;
    private String lastName;
    private int age;
    private String hometown;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getHometown() {
        return this.hometown;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }


    public String getString() {
        String result = String.format("%s %s is %d years old", this.firstName,
                this.lastName, this.age);
        return result;
    }
}
