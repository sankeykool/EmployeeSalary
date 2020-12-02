package model;

public class SalaryCalculatorVisitorImpl implements SalaryCalculatorVisitor {
    @Override
    public double visit(FixedSalaryEmployee fixedSalaryEmployee) {
        return fixedSalaryEmployee.getSalary();
    }

    @Override
    public double visit(CommissionOnlyEmployee commissionOnlyEmployee) {
        return commissionOnlyEmployee.getSalary();
    }

    @Override
    public double visit(FixedAndCommissionEmployee fixedAndCommissionEmployee) {
        return fixedAndCommissionEmployee.getSalary();
    }
}
