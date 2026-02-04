package baitap_03;

public abstract class Employee {
    private String employee_name;
    private double salary;

    public Employee(String employee_name, double salary) {
        this.employee_name = employee_name;
        this.salary = salary;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Thông tin Nhân Viên : " +
                "Tên : '" + employee_name + '\'' +
                ", Lương :" + salary +
                '\n';
    }
}
