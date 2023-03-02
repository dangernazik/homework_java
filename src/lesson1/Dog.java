package lesson1;

public class Dog {
    private String name;
    private int age;
    private String poroda;

    public Dog() {
    }

    public Dog(String name, int age, String poroda) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "title='" + name + '\'' +
                ", age=" + age +
                ", poroda='" + poroda + '\'' +
                '}';
    }

    public String getTitle() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }
}
