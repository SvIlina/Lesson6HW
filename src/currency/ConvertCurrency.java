package currency;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter rate to convert from: USD, EUR, UAH, GBP, JPY: ");
        String exchangeFrom = inputValue.next();
        System.out.println("Enter rate to convert to: USD, EUR, UAH, GBP, JPY: ");
        String exchangeTo = inputValue.next();
        System.out.println("Enter how many to exchange: ");
        int money = inputValue.nextInt();

        Currency[] currencies = {new Currency("USD", 1.0),
                new Currency("EUR", 1.123),
                new Currency("UAH", 0.037),
                new Currency("GBP", 1.3),
                new Currency("JPY", 0.0091)};

        Converter converter = new Converter(currencies);
        System.out.println("You receive " + converter.convertTo(exchangeFrom,exchangeTo,money) + " " + exchangeTo);
    }
}
