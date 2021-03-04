package Zadanie1;

public class Animal {
    protected String name;
    protected String color;
    protected String makeSound;

    public String helloWorld(){
        return " Zwierzak: " + name + " koloru " + color + " robi " + makeSound;

    }
    public Animal getAnimal(){
        return new Animal();
    }
    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getColor(){
        return color;
    }
    public void  setColor(String color){
        this.color = color;
    }

}