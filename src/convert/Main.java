package convert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter usd_value to exchange: ");
        double usdValue = inputValue.nextDouble();
        System.out.println("Enter rate_value to exchange: ");
        double rateValue = inputValue.nextDouble();

        Money exchangeMoney = new Money(usdValue, rateValue);

        System.out.println("Euro = " + exchangeMoney.convertUSDToEuro());

    }
}
