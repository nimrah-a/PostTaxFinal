package service;

import entity.JobOffer;
import entity.SalaryReport;

public class TaxCalculator implements TaxCalculatorInterface {

    public SalaryReport calculateSalary(JobOffer offer) {

        double salary = offer.getGrossAnnualSalary();

        double federalTax = salary * 0.15;
        double stateTax = salary * getStateTax(offer.getState());
        double ficaTax = salary * 0.0765;

        double takeHome = salary - federalTax - stateTax - ficaTax;

        SalaryReport report = new SalaryReport();

        report.setJobOffer(offer);
        report.setFederalTax(federalTax);
        report.setStateTax(stateTax);
        report.setFicaTax(ficaTax);
        report.setYearlyTakeHome(takeHome);
        report.setMonthlyTakeHome(takeHome / 12);

        return report;
    }

    private double getStateTax(String state) {

        if (state.equalsIgnoreCase("Illinois")) {
            return 0.0495;
        }

        if (state.equalsIgnoreCase("California")) {
            return 0.08;
        }

        if (state.equalsIgnoreCase("New York")) {
            return 0.06;
        }

        if (state.equalsIgnoreCase("Texas")) {
            return 0.00;
        }

        if (state.equalsIgnoreCase("Florida")) {
            return 0.00;
        }

        return 0.05;
    }
}