public class Employee {
    private int baseSalary;
    private int hourlyRate;

    //Constructor
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    //Getter
    public int getBaseSalary(){
        return baseSalary;
    }
    //Setter
    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0){
            throw new IllegalArgumentException("Base salary cannot be less than 1");
        } else {
            this.baseSalary = baseSalary;
        }
    }
    private void setHourlyRate(int hourlyRate){
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
