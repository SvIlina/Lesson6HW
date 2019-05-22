package digitSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value: ");
        int inputtedValues = input.nextInt();
        System.out.println(getSum(inputtedValues));
    }

    public static int getSum(int value) {
        String stringValue = String.valueOf(value);
        int sum = 0;
        for (int i = 0; i < stringValue.length(); i++) {
            sum += Character.getNumericValue(stringValue.charAt(i));
        }
        return sum;
    }
}
