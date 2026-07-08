package entity;

public class SalaryReport {

    private JobOffer jobOffer;
    private double federalTax;
    private double stateTax;
    private double ficaTax;
    private double yearlyTakeHome;
    private double monthlyTakeHome;

    public SalaryReport() {
    }

    public JobOffer getJobOffer() {
        return jobOffer;
    }

    public void setJobOffer(JobOffer jobOffer) {
        this.jobOffer = jobOffer;
    }

    public double getFederalTax() {
        return federalTax;
    }

    public void setFederalTax(double federalTax) {
        this.federalTax = federalTax;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }

    public double getFicaTax() {
        return ficaTax;
    }

    public void setFicaTax(double ficaTax) {
        this.ficaTax = ficaTax;
    }

    public double getYearlyTakeHome() {
        return yearlyTakeHome;
    }

    public void setYearlyTakeHome(double yearlyTakeHome) {
        this.yearlyTakeHome = yearlyTakeHome;
    }

    public double getMonthlyTakeHome() {
        return monthlyTakeHome;
    }

    public void setMonthlyTakeHome(double monthlyTakeHome) {
        this.monthlyTakeHome = monthlyTakeHome;
    }
}