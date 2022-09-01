
package uml_test;


public class HourlyEmployee extends Employee implements CalculateSalary{
public int workHours;
public double hourPayment;

    public HourlyEmployee() {
    }

    public HourlyEmployee(int workHours, double hourPayment, int id, String name) {
        super(id, name);
        this.workHours = workHours;
        this.hourPayment = hourPayment;
    }
    

    
    
    
    @Override
    public double calaulate_salary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
