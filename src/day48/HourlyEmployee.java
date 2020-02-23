package day48;


public class HourlyEmployee extends Employee {

    double hourlyWage;
    int numsOfHours; // annual hours worked

    public HourlyEmployee(String name, int id, double hourlyWage, int numsOfHours){
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numsOfHours = numsOfHours;

    }

    @Override
    public void calculateAnnualSalary(){

        System.out.println("Hourly Employee yearly : " + (hourlyWage*numsOfHours));
    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numsOfHours +
                ", name='" + name + '\'' +
                ", ID=" + ID + "yearly salary = " + (hourlyWage * numsOfHours)
                +  '}';
    }
}
