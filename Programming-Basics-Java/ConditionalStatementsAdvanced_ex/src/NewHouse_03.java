import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (flower.equals("Roses")) {
            price = 5.0;
            if (countFlowers > 80) {
                price = price - (price * 0.10);
            }
        } else if (flower.equals("Dahlias")) {
            price = 3.80;
            if (countFlowers > 90) {
                price = price - (price * 0.15);
            }
        } else if (flower.equals("Tulips")) {
            price = 2.80;
            if (countFlowers > 80) {
                price = price - (price * 0.15);
            }
        } else if (flower.equals("Narcissus")) {
            price = 3.0;
            if (countFlowers < 120) {
                price = price + (price * 0.15);
            }
        } else if (flower.equals("Gladiolus")) {
            price = 2.50;
            if (countFlowers < 80) {
                price = price + (price * 0.20);
            }
        }
        double totalPrice = countFlowers * price;
        double diff = Math.abs(totalPrice - budget);
        if (totalPrice <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countFlowers,flower,diff);
        } else if (totalPrice > budget) {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
