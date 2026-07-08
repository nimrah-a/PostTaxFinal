package entity;

public class JobOffer {

    private String companyName;
    private String jobTitle;
    private String state;
    private double grossAnnualSalary;

    public JobOffer() {
    }

    public JobOffer(String companyName, String jobTitle, String state, double grossAnnualSalary) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.state = state;
        this.grossAnnualSalary = grossAnnualSalary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getGrossAnnualSalary() {
        return grossAnnualSalary;
    }

    public void setGrossAnnualSalary(double grossAnnualSalary) {
        this.grossAnnualSalary = grossAnnualSalary;
    }
}