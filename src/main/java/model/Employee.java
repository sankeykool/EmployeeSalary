package model;

public interface Employee {
    public Double acceptSalaryCalculator(SalaryCalculatorVisitor salaryCalculatorVisitor);
    public String acceptEmployeeDetailer(EmployeeDetailsVisitor employeeDetailsVisitor);
}
