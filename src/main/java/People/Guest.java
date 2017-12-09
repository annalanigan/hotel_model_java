package People;

public class Guest {

    private String name;
    private double bill;

    public Guest(String name) {
        this.name = name;
        this.bill = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public void addToBill(double value){
        this.bill += value;
    }
}
