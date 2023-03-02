package lesson1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> bookAuthors = new <String>ArrayList();
        bookAuthors.add("Jonh");
        bookAuthors.add("Mike");
        bookAuthors.add("Cole");


        Book book = new Book("Good book", 231, bookAuthors, "Fantasy");
        System.out.println(book);
        Car car = new Car("Mercedes", 463, 3.0, true);
        System.out.println(car);
        Dog dog = new Dog("Barsik", 5, "bulldog");
        System.out.println(dog);

    }

}

