public class Employee {
    private int baseSalary;
    private int hourlyRate;

    //Static members of class
    public static int numberOfEmployees;

    //Constructor
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    //Overloading a constructor
    public Employee(int baseSalary){
        this(baseSalary, 0);
    }

    // Static method of class
    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }
    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    //Overloading a method. with this you can use calculateWage() with extraHours = 0
    // Overloading is great but do not over use it.
    public int calculateWage() {
        return calculateWage(0);
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
        if (hourlyRate < 0){
            throw  new IllegalArgumentException("Hourly rate cannot be less than 1");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }
    public int getHourlyRate(){
        return hourlyRate;
    }
}
