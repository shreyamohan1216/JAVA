package is.oops.pillars.association.aggregation;

public class Payment {
    double regFees,admFees,balAmt;

    public Payment(double admFees, double regFees, double balAmt) {
        this.admFees = admFees;
        this.regFees = regFees;
        this.balAmt = balAmt;
    }
}
