package model;



public class Staff {
    protected int id;
    protected String name;
    public String designation;
    public double hoursWorked;
    public double hourlyRate;
    public double allowances;
    public double deductions;

    public Staff() {
        this.id = 0;
        this.name = "Unknown";
        this.designation = "Staff";
        this.hoursWorked = 0;
        this.hourlyRate = 0;
        this.allowances = 0;
        this.deductions = 0;
    }

    public Staff(int id, String name, String designation,
                 double hoursWorked, double hourlyRate,
                 double allowances, double deductions) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.allowances = allowances;
        this.deductions = deductions;
    }

    public double calculateBasicSalary() { return hoursWorked * hourlyRate; }
    public double calculateGrossSalary() { return calculateBasicSalary() + allowances; }
    public double calculateNetSalary()   { return calculateGrossSalary() - deductions; }

    public void displaySalaryDetails() {
        System.out.println("------------------------------------------------");
        System.out.printf("Staff ID         : %d%n", id);
        System.out.printf("Name             : %s%n", name);
        System.out.printf("Designation      : %s%n", designation);
        System.out.printf("Hours Worked     : %.2f%n", hoursWorked);
        System.out.printf("Hourly Rate      : %.2f%n", hourlyRate);
        System.out.printf("Basic Salary     : %.2f%n", calculateBasicSalary());
        System.out.printf("Allowances       : %.2f%n", allowances);
        System.out.printf("Deductions       : %.2f%n", deductions);
        System.out.printf("Gross Salary     : %.2f%n", calculateGrossSalary());
        System.out.printf("NET SALARY       : %.2f%n", calculateNetSalary());
        System.out.println("------------------------------------------------");
    }

    public int getId() { return id; }
    public String getName() { return name; }
}
