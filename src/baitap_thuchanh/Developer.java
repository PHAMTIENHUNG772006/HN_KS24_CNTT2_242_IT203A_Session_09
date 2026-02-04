package baitap_thuchanh;

public class Developer extends Employee{
    public Developer(String employee_name, double salary) {
        super(employee_name, salary);
    }
    @Override
    double getSalary(double bonus){
        return super.getSalary() +  (super.getSalary() * bonus);
    }
}
