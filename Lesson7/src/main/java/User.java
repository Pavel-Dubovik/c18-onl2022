public class User {
    private String firstName;
    private String secondName;
    private int age;
    private String gender;

    public User() {
    }

    public User(String firstName) {
        this.firstName = firstName;
    }

    public User(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public User(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public User(int age) {
        this.age = age;
    }

    public User(int age, String firstName) {
        this();
        this.firstName = firstName;
    }

    public User(String firstName, String secondName, int age, String gender) {
        this();
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getFullName() {
        return firstName + " " + secondName;
    }

    public void increaseAge(int age) {
        this.age = age + 1;
    }

    @Deprecated
    public void printInfo(String firstName, String secondName, int age, String gender) {
        System.out.println(firstName);
        System.out.println(secondName);
        System.out.println(age);
        System.out.println(gender);
    }
}
