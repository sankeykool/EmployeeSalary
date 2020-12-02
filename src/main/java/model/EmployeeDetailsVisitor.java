package model;

public interface EmployeeDetailsVisitor {
    String visit(FixedSalaryEmployee fixedSalaryEmployee);
    String visit(CommissionOnlyEmployee commissionOnlyEmployee);
    String visit(FixedAndCommissionEmployee fixedAndCommissionEmployee);
}
