package baitap_05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Nguyễn Văn A",15000));
        employees.add(new ProductionEmployee("Trần Thị B", 15000));

        double totalSalary = 0;
        for (Employee emp : employees) {
            System.out.println(emp.displayInfo());
            totalSalary += emp.calculateSalary();
        }

        System.out.println("Tổng lương toàn bộ nhân viên: " + totalSalary);

    }
}
