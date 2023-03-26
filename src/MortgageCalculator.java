import java.text.NumberFormat;

public class MortgageCalculator {
    private int principal;
    private float annualInterest;
    private byte years;
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    public MortgageCalculator(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
            float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
            float numberOfPayments = getNumberOfPayments();

            double balance = principal
                    * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                    / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

            return balance;
        }

        public double[] getRemainingBalance(){
        double[] balances = new double[getNumberOfPayments()];
            for (short month = 1; month <= balances.length; month++) {
                balances[month - 1] = calculateBalance(month);
            }
            return balances;
        }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
}
