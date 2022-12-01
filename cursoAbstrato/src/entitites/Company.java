package entitites;

public class Company extends TaxPayer{

    private Integer numberOfEmployee;

    public Company(){
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployee) {
        super(name, anualIncome);
        this.numberOfEmployee = numberOfEmployee;
    }

    public Integer getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(Integer numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }



    public Double tax() {
        if (getNumberOfEmployee() < 10) {
            return (getAnualIncome() * 0.16);
        } else {
            return (getAnualIncome() * 0.14);
        }
    }
}
