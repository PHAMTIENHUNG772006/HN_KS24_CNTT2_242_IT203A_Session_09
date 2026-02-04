package Parent;

public class Parent {
    private String name;
    private int age;
    private  String home;

    public Parent(String name, int age, String home) {
        this.name = name;
        this.age = age;
        this.home = home;
    }

    public void say(){
        System.out.println("Hello in parent");
    }
}
