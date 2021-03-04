package Zadanie1;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setMakeSound();
        dog.setName("Rex");
        dog.setColor("Brązowego");
        System.out.println(dog.helloWorld());

        Cat cat = new Cat();
        cat.setMakeSound();
        cat.setName("Xer");
        cat.setColor("Białego");
        System.out.println(cat.helloWorld());
    }
}