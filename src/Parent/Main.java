package Parent;

public class Main {
    // private int b biến instance
    // private static Strinf name // biến tĩnh
    // private static void say(String lable) biến tham chiếu
    //
    public static void main(String[] args) {
        // int a; biến local
        Child kit = new Child("hưng",18,"Hà hiang","Nam sơn");

        kit.say();
        kit.say1();
    }
}