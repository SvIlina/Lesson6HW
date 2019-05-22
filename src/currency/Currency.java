package currency;

public class Currency {

    private final String name;
    private final double rate;

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public Currency(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }
}
