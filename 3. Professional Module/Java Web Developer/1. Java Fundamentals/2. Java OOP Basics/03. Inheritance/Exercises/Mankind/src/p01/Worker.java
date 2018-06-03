package p01;

import java.util.Locale;

public class Worker extends Human{
    private double weekSalary;
    private double hoursPerDay;

    public Worker(String fName, String lName,double weekSalary,double hoursPerDay) {
        super(fName, lName);
        this.setWeekSalary(weekSalary);
        this.setHoursPerDay(hoursPerDay);
    }

    public void setWeekSalary(double weekSalary) {
        if(weekSalary<=10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    private double getHoursPerDay() {
        return hoursPerDay;
    }

    private double getWeekSalary() {
        return weekSalary;
    }

    public void setHoursPerDay(double hoursPerDay) {
        if(hoursPerDay<1 || hoursPerDay>12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hoursPerDay = hoursPerDay;
    }

    public double calculateSalaryPerHour(){
        return this.weekSalary / (hoursPerDay * 5);
    }

    @Override
    public String toString() {
        return String.format(Locale.ROOT,"First Name: %s\n" +
                        "Last Name: %s\n" +
                        "Week Salary: %.2f\n" +
                        "Hours per day: %.2f\n" +
                        "Salary per hour: %.2f\n",super.getfName(),super.getlName(),this.getWeekSalary(),this.getHoursPerDay(),
                this.calculateSalaryPerHour());
    }
}


//
//package p01;
//
//public class Worker extends Human {
//
//    private Double weekSalary;
//    private Double workHoursPerDay;
//    private Double salaryPerHour;
//
//    public Worker(String firstName, String lastName, Double weekSalary, Double workHoursPerDay) {
//        super(firstName, lastName);
//        super.setFirstName(firstName);
//        this.setLastName(lastName);
//        this.setWeekSalary(weekSalary);
//        this.setWorkHoursPerDay(workHoursPerDay);
//        this.setSalaryPerHour(weekSalary, workHoursPerDay);
//    }
//
//    public Double getWeekSalary() {
//        return this.weekSalary;
//    }
//
//    protected void setWeekSalary(Double weekSalary) {
//        if (weekSalary < 11.0) {
//            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
//        }
//        this.weekSalary = weekSalary;
//    }
//
//    public Double getWorkHoursPerDay() {
//        return this.workHoursPerDay;
//    }
//
//    protected void setWorkHoursPerDay(Double workHoursPerDay) {
//        if (workHoursPerDay < 1.0 || workHoursPerDay > 12.0)  {
//            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
//        }
//        this.workHoursPerDay = workHoursPerDay;
//    }
//
//    protected void setSalaryPerHour(Double weekSalary, Double workHoursPerDay) {
//        this.salaryPerHour = weekSalary / 5 / workHoursPerDay;
//    }
//
//    public Double getSalaryPerHour() {
//        return this.salaryPerHour;
//    }
//
//    @Override
//    protected void setLastName(String firstName) {
//        if (firstName.length() < 4) {
//            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
//        }
//        super.setLastName(firstName);
//    }
//}
