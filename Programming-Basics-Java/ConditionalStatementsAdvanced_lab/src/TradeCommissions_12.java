import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double salesVolume = Double.parseDouble(scanner.nextLine());

        double tradeCom = 0;
        if (city.equals("Sofia")) {
            if (salesVolume >= 0 && salesVolume <= 500) {
                tradeCom = 0.05 * salesVolume;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 100 && salesVolume <= 1000) {
                tradeCom = 0.07 * salesVolume;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                tradeCom = 0.08 * salesVolume;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 10000) {
                tradeCom = 0.12 * salesVolume;
                System.out.printf("%.2f", tradeCom);
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Varna")) {
            if (salesVolume >= 0 && salesVolume <= 500) {
                tradeCom = 0.045 * salesVolume;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 100 && salesVolume <= 1000) {
                tradeCom = 0.075 * salesVolume;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                tradeCom = 0.10 * salesVolume;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 10000) {
                tradeCom = 0.13 * salesVolume;
                System.out.printf("%.2f", tradeCom);
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Plovdiv")) {
            if (salesVolume >= 0 && salesVolume <= 500) {
                tradeCom = 0.055 * salesVolume;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 100 && salesVolume <= 1000) {
                tradeCom = 0.08 * salesVolume;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 1000 && salesVolume <= 10000) {
                tradeCom = 0.12 * salesVolume;
                System.out.printf("%.2f", tradeCom);
            } else if (salesVolume > 10000) {
                tradeCom = 0.145 * salesVolume;
                System.out.printf("%.2f", tradeCom);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
