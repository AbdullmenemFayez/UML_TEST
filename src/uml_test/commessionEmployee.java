
package uml_test;

public class commessionEmployee extends SalaryEmployee implements CalculateSalary{
    double revenue;

   

    public commessionEmployee(double revenue, int overTimeHours, double overTimerPayment, double baseSalary, int id, String name) {
        super(overTimeHours, overTimerPayment, baseSalary, id, name);
        this.revenue = revenue;
    }

    public commessionEmployee() {
        
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }
    @Override
    public double calaulate_salary(){
      throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
