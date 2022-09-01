package uml_test;

public class SalaryEmployee extends Employee implements CalculateSalary{

    private int overTimeHours;
    private double overTimerPayment,
            baseSalary;

    public SalaryEmployee() {
        super(0, "");
        this.overTimeHours = 0;
        this.overTimerPayment = 0.0;
        this.baseSalary = 0.0;
    }

    public SalaryEmployee(int overTimeHours, double overTimerPayment, double baseSalary, int id, String name) {
        super(id, name);
        this.overTimeHours = overTimeHours;
        this.overTimerPayment = overTimerPayment;
        this.baseSalary = baseSalary;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getOverTimerPayment() {
        return overTimerPayment;
    }

    public void setOverTimerPayment(double overTimerPayment) {
        this.overTimerPayment = overTimerPayment;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calaulate_salary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
