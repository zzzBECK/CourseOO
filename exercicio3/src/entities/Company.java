package entities;

public class Company extends TaxPayer{
    private int numberOfEmployees;

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax(){
        double value;

        if (numberOfEmployees > 10){
            value = 0.14 * super.getAnualIncome();
        }
        else{
            value = 0.16 * super.getAnualIncome();
        }

        return value;
    }
}