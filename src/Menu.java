
import entity.JobOffer;
import entity.SalaryReport;
import service.TaxCalculator;

import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);
    private TaxCalculator calculator = new TaxCalculator();

    public void showMenu() {

        int choice = 0;

        while (choice != 7) {

            System.out.println();
            System.out.println("===== Career Salary Analyzer =====");
            System.out.println("1. Calculate Salary");
            System.out.println("2. Monthly Take Home");
            System.out.println("3. Compare Two Salaries");
            System.out.println("4. Compare States");
            System.out.println("5. View Tax Breakdown");
            System.out.println("6. Save History");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    calculateSalary();
                    break;

                case 2:
                    calculateMonthlySalary();
                    break;

                case 3:
                    compareSalaries();
                    break;

                case 4:
                    compareStates();
                    break;

                case 5:
                    showTaxBreakdown();
                    break;

                case 6:
                    saveHistory();
                    break;

                case 7:
                    System.out.println("Thank you for using Career Salary Analyzer.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private JobOffer getJobOffer() {

        JobOffer offer = new JobOffer();

        System.out.print("Company Name: ");
        offer.setCompanyName(input.nextLine());

        System.out.print("Job Title: ");
        offer.setJobTitle(input.nextLine());

        System.out.print("State: ");
        offer.setState(input.nextLine());

        System.out.print("Gross Annual Salary: ");
        offer.setGrossAnnualSalary(input.nextDouble());

        input.nextLine();

        return offer;
    }

    private void calculateSalary() {

        JobOffer offer = getJobOffer();

        SalaryReport report = calculator.calculateSalary(offer);

        System.out.println();
        System.out.println("Salary Report");
        System.out.println("------------------------");
        System.out.println("Company: " + offer.getCompanyName());
        System.out.println("Job Title: " + offer.getJobTitle());
        System.out.println("State: " + offer.getState());
        System.out.println();
        System.out.println("Gross Salary: $" + offer.getGrossAnnualSalary());
        System.out.println("Federal Tax: $" + report.getFederalTax());
        System.out.println("State Tax: $" + report.getStateTax());
        System.out.println("FICA Tax: $" + report.getFicaTax());
        System.out.println();
        System.out.println("Take Home Salary: $" + report.getYearlyTakeHome());
        System.out.println("Monthly Salary: $" + report.getMonthlyTakeHome());
    }

    private void calculateMonthlySalary() {

        JobOffer offer = getJobOffer();

        SalaryReport report = calculator.calculateSalary(offer);

        System.out.println();
        System.out.println("Monthly Take Home Salary: $" + report.getMonthlyTakeHome());
    }

    private void compareSalaries() {

        System.out.println();
        System.out.println("This feature will be added in Sprint 3.");
    }

    private void compareStates() {

        System.out.println();
        System.out.println("This feature will be added in Sprint 3.");
    }

    private void showTaxBreakdown() {

        JobOffer offer = getJobOffer();

        SalaryReport report = calculator.calculateSalary(offer);

        System.out.println();
        System.out.println("Tax Breakdown");
        System.out.println("------------------------");
        System.out.println("Gross Salary: $" + offer.getGrossAnnualSalary());
        System.out.println("Federal Tax: $" + report.getFederalTax());
        System.out.println("State Tax: $" + report.getStateTax());
        System.out.println("FICA Tax: $" + report.getFicaTax());
    }

    private void saveHistory() {

        System.out.println();
        System.out.println("This feature will be added in Sprint 3.");
    }
}