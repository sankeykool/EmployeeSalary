package model;

import com.google.gson.Gson;

public class EmployeeDetailsVisitorImpl implements EmployeeDetailsVisitor {
    @Override
    public String visit(FixedSalaryEmployee fixedSalaryEmployee) {
        return new Gson().toJson(fixedSalaryEmployee);
    }

    @Override
    public String visit(CommissionOnlyEmployee commissionOnlyEmployee) {
        return new Gson().toJson(commissionOnlyEmployee);
    }

    @Override
    public String visit(FixedAndCommissionEmployee fixedAndCommissionEmployee) {
        return new Gson().toJson(fixedAndCommissionEmployee);
    }
}
