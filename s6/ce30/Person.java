package s6.ce30;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100)
            this.age = 0;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isTeen() {
        return (this.getAge() > 12 && this.getAge() < 20);
    }

    public String getFullName() {
        if (this.getFirstName().isEmpty() && this.getLastName().isEmpty())
            return "";
        if (this.getFirstName().isEmpty())
            return this.getLastName();
        if (this.getLastName().isEmpty())
            return this.getFirstName();
        // return this.getFirstName().concat(" ").concat(this.getLastName());
        return this.getFirstName() + " " + this.getLastName();
    }
}