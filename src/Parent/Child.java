package Parent;

public class Child extends Parent{
    private String address;

    public  Child(String name, int age, String home, String address){
         super(name,age,home);
         this.address = address;
    }

    @Override
    public void say() {
        // Điều kiện đẻ ghi đè
        /*
        - Tên phương thức và tham số phải trùng với lớp cha
        - kiểu trả về của phương thức ở lớp con giống hệt sử dụng super();
        -
         */
        System.out.println("hello in child");
    }

    public  void  say1(){
        super.say();
    }
}
