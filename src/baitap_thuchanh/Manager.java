package baitap_thuchanh;

public class Manager  extends Employee{
    public Manager(String employee_name, double salary) {
        super(employee_name, salary);
    }
    @Override
    double getSalary(double bonus){
        return super.getSalary() +  (super.getSalary() * bonus);
    }
}
