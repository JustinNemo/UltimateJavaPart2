public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    public int getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0){
            throw new IllegalArgumentException("Base salary cannot be less than 1");
        } else {
            this.baseSalary = baseSalary;
        }
    }
    public void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0){
            throw  new IllegalArgumentException("Hourly rate cannot be less than 1");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }
    public int getHourlyRate(){
        return hourlyRate;
    }
}
