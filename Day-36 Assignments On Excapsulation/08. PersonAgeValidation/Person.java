
/*
8\. Create a `Person` class where age must be >= 0 and <= 120.
*/

public class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age, age must be between 0 to 120");
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Alex");

        p1.setAge(150);
        p1.setAge(25);

        System.out.println("Name : " + p1.getName());
        System.out.println("Age : " + p1.getAge());
    }
}
