package entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        Double value;
        if (super.getAnualIncome() < 20000){
            value =  (0.15 * super.getAnualIncome()) - (0.5 * healthExpenditures);
        }
        else{
            value = (0.25 * super.getAnualIncome()) - (0.5 * healthExpenditures);
        }

        return value;
    }

    
}