import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double priceTicket = 0;
        double transportPrice = 0;
        if (category.equals("VIP")) {
            priceTicket = 499.99;
        } else if (category.equals("Normal")) {
            priceTicket = 249.99;
        }
        double totalPrice = people * priceTicket;

        if (people >= 1 && people <= 4) {
            transportPrice = budget * 0.75;
        } else if (people <= 9) {
            transportPrice = budget * 0.60;
        } else if (people <= 24) {
            transportPrice = budget * 0.50;
        } else if (people <= 49) {
            transportPrice = budget * 0.40;
        } else {
            transportPrice = budget * 0.25;
        }
        double moneyLeft = budget - transportPrice;

        double diff = Math.abs(moneyLeft - totalPrice);
        if (moneyLeft >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
