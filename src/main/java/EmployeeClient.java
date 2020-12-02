import model.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public static void main(String[] args) {

        CommissionOnlyEmployee commissionOnlyEmployee = new CommissionOnlyEmployee(1, "Employee1", "Department1", 1000.00);
        FixedSalaryEmployee fixedSalaryEmployee = new FixedSalaryEmployee(1, "Employee2", "Department2", 2000.00);
        FixedAndCommissionEmployee fixedAndCommissionEmployee = new FixedAndCommissionEmployee(1, "Employee3", "Department3", 3000.00);

        List<Employee> employees = new ArrayList<>();
        employees.add(commissionOnlyEmployee);
        employees.add(fixedSalaryEmployee);
        employees.add(fixedAndCommissionEmployee);

        displayTotalSalary(employees);
        displayEmployeeDetails(employees);
    }

    public static void displayTotalSalary(List<Employee> employees) {
        Double totalSalary = 0.0;

        SalaryCalculatorVisitor salaryCalculatorVisitor = new SalaryCalculatorVisitorImpl();
        for (Employee employee : employees) {
            totalSalary += employee.acceptSalaryCalculator(salaryCalculatorVisitor);
        }

        System.out.println(totalSalary);
    }

    public static void displayEmployeeDetails(List<Employee> employees) {
        EmployeeDetailsVisitor employeeDetailsVisitor = new EmployeeDetailsVisitorImpl();
        for (Employee employee : employees) {
            System.out.println(employee.acceptEmployeeDetailer(employeeDetailsVisitor));
        }
    }
}
