package model;

public class CommissionOnlyEmployee implements Employee {
    private Integer employeeId;
    private String employeeName;
    private String department;
    private Double salary;

    public CommissionOnlyEmployee(Integer employeeId, String employeeName, String department, Double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public Double acceptSalaryCalculator(SalaryCalculatorVisitor salaryCalculatorVisitor) {
        return salaryCalculatorVisitor.visit(this);
    }

    @Override
    public String acceptEmployeeDetailer(EmployeeDetailsVisitor employeeDetailsVisitor) {
        return employeeDetailsVisitor.visit(this);
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
