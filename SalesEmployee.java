package com.ERP.Sales.Commission.Employee;

import java.util.UUID;

public class SalesEmployee {
    private final UUID id;
    private final int sales_made;
    private final double salary;
    private final double commission_amount;
    private final double incentive_amount;
    private final int target_set;
    private final String product_sold;
    private final int quarter_id;
    private final boolean status;

    public SalesEmployee(UUID id, int sales_made, double salary, double commission_amount, double incentive_amount, int target_set, String product_sold, int quarter_id, boolean status) {
        this.id = id;
        this.sales_made = sales_made;
        this.salary = salary;
        this.commission_amount = commission_amount;
        this.incentive_amount = incentive_amount;
        this.target_set = target_set;
        this.product_sold = product_sold;
        this.quarter_id = quarter_id;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public int getSales_made() {
        return sales_made;
    }

    public double getSalary() {
        return salary;
    }

    public double getCommission_amount() {
        return commission_amount;
    }

    public double getIncentive_amount() {
        return incentive_amount;
    }

    public int getTarget_set() {
        return target_set;
    }

    public String getProduct_sold() {
        return product_sold;
    }

    public int getQuarter_id() {
        return quarter_id;
    }

    public boolean isStatus() {
        return status;
    }
}
