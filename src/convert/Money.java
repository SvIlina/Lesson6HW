package convert;

public class Money {

    private double usd;
    private double rate;

    Money(double newUsd, double newRate) {
        usd = newUsd;
        rate = newRate;
    }

    public double convertUSDToEuro() {
        return usd * rate;
    }

}
