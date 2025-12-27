abstract class Person {
    protected String id;
    protected String name;
    protected String birthday;
    protected String gender;
    protected String hometown;
    protected String department;

    public Person(String id, String name, String birthday, String gender, String hometown, String department) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.hometown = hometown;
        this.department = department;
    }

    public abstract void displayInfo();
}