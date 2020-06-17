package collections;

public class User {
    private int age;
    private String name;
    private double size;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(int age, String name, double size) {
        this.age = age;
        this.name = name;
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
