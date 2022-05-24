import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double discount = 0;
        if (season.equals("Spring")) {
            price = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            price = 4200;
        } else if (season.equals("Winter")) {
            price = 2600;
        }
        if (fishermen <= 6) {
            discount = 0.10;
        } else if (fishermen <= 11) {
            discount = 0.15;
        } else {
            discount = 0.25;
        }
        double totalPrice = price - (price * discount);
        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }
        double diff = Math.abs(totalPrice - budget);
        if (totalPrice <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else if (totalPrice > budget) {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
