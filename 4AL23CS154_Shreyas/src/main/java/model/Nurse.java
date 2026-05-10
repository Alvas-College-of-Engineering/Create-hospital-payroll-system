package model;
public class Nurse extends Staff {
    private String shift;
    private double shiftAllowance;

    public Nurse(int id, String name, double hoursWorked, double hourlyRate,
                 double allowances, double deductions,
                 String shift, double shiftAllowance) {
        super(id, name, "Nurse", hoursWorked, hourlyRate, allowances, deductions);
        this.shift = shift;
        this.shiftAllowance = shiftAllowance;
    }

    @Override
    public double calculateGrossSalary() {
        return super.calculateGrossSalary() + shiftAllowance;
    }

    @Override
    public void displaySalaryDetails() {
        super.displaySalaryDetails();
        System.out.printf("Shift            : %s (+%.2f allowance)%n",
                shift, shiftAllowance);
        System.out.println("------------------------------------------------");
    }
}
