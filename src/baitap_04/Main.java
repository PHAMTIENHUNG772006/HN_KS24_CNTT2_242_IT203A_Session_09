package baitap_04;

public class Main {
    public static void main(String[] args) {
        Animal  animal =  new Dog();

        animal.makeSound();

        if (animal instanceof  Dog){
            Dog dog = (Dog) animal;
            dog.playBall();
        }
    }
}
