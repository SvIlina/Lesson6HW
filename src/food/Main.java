package food;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputtedDish = new Scanner(System.in);
        System.out.println("Please, enter a quantity of dishes: ");
        int dishes = inputtedDish.nextInt();
        Dish dish [] = new Dish[dishes];
int sum = 0;
        for (int i = 0; i <dishes ; i++) {

            System.out.println("Please, enter name of dish: ");
            String dishName1 = inputtedDish.next();
            System.out.println("Please, enter calories of dish");
            int calories1 = inputtedDish.nextInt();
            dish[i]= new Dish(dishName1,calories1);
            sum += dish[i].calories;
        }
        System.out.println(sum);
    }
}
