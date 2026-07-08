package service;

import entity.JobOffer;
import entity.SalaryReport;

public interface TaxCalculatorInterface {
    public SalaryReport calculateSalary(JobOffer offer);
}
