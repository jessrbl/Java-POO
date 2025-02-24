package Exercise4.entities;

public class CurrencyConverter {

    private double dollarPrice;
    private double totInDolars;

    public void setDollarPrice(double dollarPrice) {
        this.dollarPrice = dollarPrice;
    }

    public double getDollarPrice() {
        return dollarPrice;
    }

    public void setTotInDolars(double totInDolars) {
        this.totInDolars = totInDolars;
    }

    public double getTotInDolars() {
        return totInDolars;
    }

    public double amountToBePaid() {
        return (dollarPrice*totInDolars)*(0.06) + dollarPrice*totInDolars;
    }







}


