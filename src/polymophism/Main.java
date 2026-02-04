package polymophism;

public class Main {
    public static void main(String[] args) {
        // kiểu khai báo thực tế
        Animal cat  = new Cat(); // kiểu khai báo là animal còn kiểu thực tế là Cat
        Animal dog  = new Dog();
        Animal animal  = new Animal();

        //Ép kiểu ngầm định / ép kiểu tường minh

        Cat cat1 = new Cat();
        Animal animal1 = cat;

        if (animal1 instanceof Cat){
            Cat cat2 = (Cat) animal1;
        }


    }
}
