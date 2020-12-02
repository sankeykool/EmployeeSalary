package model;

public interface SalaryCalculatorVisitor {
    double visit(FixedSalaryEmployee fixedSalaryEmployee);
    double visit(CommissionOnlyEmployee commissionOnlyEmployee);
    double visit(FixedAndCommissionEmployee fixedAndCommissionEmployee);
}
