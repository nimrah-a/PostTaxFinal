package Entity;

public class JobOffer {

    private String company;
    private String position;
    private double annualSalary;
    private String state;

    public JobOffer(String company, String position, double annualSalary, String state){
        this.company = company;
        this.position = position;
        this.annualSalary = annualSalary;
        this.state = state;


    }

    public String getCompany() {
        return company;

    }

    public String getPosition() {
        return position;
    }

    public double getAnnualSalary() {
        return annualSalary;

    }

    public String getState(){
        return state;
    }
}
