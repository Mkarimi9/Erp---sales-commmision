package com.ERP.Sales.Commission.Budget;

public class Budget {
    private final int qaurter_id;
    private final int qaurter_num;
    private final double commission_percentage;
    private final double incentive_amount;
    private final int target_sale;
    private boolean status;

    public Budget(int qaurter_id, int qaurter_num, double commission_percentage, double incentive_amount, int target_sale, boolean status) {
        this.qaurter_id = qaurter_id;
        this.qaurter_num = qaurter_num;
        this.commission_percentage = commission_percentage;
        this.incentive_amount = incentive_amount;
        this.target_sale = target_sale;
        this.status = status;
    }

    public int getQaurter_id() {
        return qaurter_id;
    }

    public int getQaurter_num() {
        return qaurter_num;
    }

    public double getCommission_percentage() {
        return commission_percentage;
    }

    public double getIncentive_amount() {
        return incentive_amount;
    }

    public int getTarget_sale() {
        return target_sale;
    }

    public boolean isStatus() {
        return status;
    }
}
