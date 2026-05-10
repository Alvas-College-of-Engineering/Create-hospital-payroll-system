package model;

public class Doctor extends Staff {

    private String specialization;
    private double specializationBonus;

    public Doctor(int id, String name, double hoursWorked, double hourlyRate,
                  double allowances, double deductions,
                  String specialization, double specializationBonus) {

        super(id, name, "Doctor",
                hoursWorked, hourlyRate,
                allowances, deductions);

        this.specialization = specialization;
        this.specializationBonus = specializationBonus;
    }

    @Override
    public double calculateGrossSalary() {
        return super.calculateGrossSalary() + specializationBonus;
    }

    @Override
    public void displaySalaryDetails() {

        super.displaySalaryDetails();

        System.out.printf(
                "Specialization : %s (+%.2f bonus)%n",
                specialization,
                specializationBonus
        );

        System.out.println("--------------------------------");
    }
}