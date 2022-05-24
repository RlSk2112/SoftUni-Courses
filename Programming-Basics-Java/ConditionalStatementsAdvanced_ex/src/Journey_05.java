import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String destination = "";
        String vacation = "";
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.3;
                vacation = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.7;
                vacation = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.4;
                vacation = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.8;
                vacation = "Hotel";
            }
        } else if (budget > 1000) {
            destination = "Europe";
            price = budget * 0.9;
            vacation = "Hotel";
        }
        System.out.printf("Somewhere in %s\n" +
                "%s - %.2f", destination, vacation, price);
    }
}
