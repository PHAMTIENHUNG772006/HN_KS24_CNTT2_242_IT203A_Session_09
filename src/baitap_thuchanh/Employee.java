package baitap_thuchanh;

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

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    double getSalary() {
        return getSalarEmployee();
    }

    double getSalary(double bonus) {
        return getSalarEmployee() + bonus;
    }

    double getSalarEmployee() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public static void main(String[] args) {
        Employee e1 = new Manager("Phạm Tiến Hưng",150000);

        Employee e2 = new Developer("Phạm Tiến Quang",150000);

        Employee e3 = new Employee("Phạm Tiến Lợi", 150000) {
        };

        System.out.println(e1.getSalary(0.3));
        System.out.println(e2.getSalary(0.2));
        System.out.println(e3.getSalary());
    }
}
