package currency;

public class Converter {

    private Currency[] currencies;

    public Converter(Currency[] currencies) {
        this.currencies = currencies;
    }

    public double convertTo(String exchangeFrom, String exchangeTo, double value) {
        double exchangeFromRate = 0;
        double exchangeToRate = 0;
        for (int i = 0; i < currencies.length; i++) {
            if (currencies[i].getName().equals(exchangeFrom)) {
                exchangeFromRate = currencies[i].getRate();
            }
            if (currencies[i].getName().equals(exchangeTo)) {
                exchangeToRate = currencies[i].getRate();
            }

        }
        if (exchangeFromRate == 0 || exchangeToRate == 0) {
            System.out.println("One of the entered value is invalid");
        }

        return Math.round(value * exchangeFromRate / exchangeToRate);
    }
}
