public class Employee {

        String name;
        double grossSalary;
        double tax;

        public double NetSalary(){
                return this.grossSalary - this.tax;
        }

        public void IncreaseSalary(double percentage){
                double f = percentage / 100 * this.grossSalary;
                this.grossSalary = this.grossSalary + f;
        }
        
}
