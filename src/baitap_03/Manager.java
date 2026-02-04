package baitap_03;


public class Manager extends Employee {
    private String department;
    public Manager(String employee_name, double salary,String department) {
        super(employee_name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String displayImfo(){
        return super.toString()  + "Phòng ban : " +  this.getDepartment();
    }
}
