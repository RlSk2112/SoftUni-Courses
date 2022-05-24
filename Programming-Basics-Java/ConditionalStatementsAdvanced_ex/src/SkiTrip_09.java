import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String positiveOrNegative = scanner.nextLine();
        double overnights = days - 1;
        double roomPrice = 0;
        if (typeOfRoom.equals("room for one person")) {
            roomPrice = 18.00;
        } else if (typeOfRoom.equals("apartment")) {
            roomPrice = 25.00;
            if (days < 10) {
                roomPrice = roomPrice - roomPrice * 0.30;
            } else if (days <= 15) {
                roomPrice = roomPrice - roomPrice * 0.35;
            } else {
                roomPrice = roomPrice - roomPrice * 0.50;
            }
        } else if (typeOfRoom.equals("president apartment")) {
            roomPrice = 35.00;
            if (days < 10) {
                roomPrice = roomPrice - (roomPrice * 0.10);
            } else if (days <= 15) {
                roomPrice = roomPrice - roomPrice * 0.15;
            } else {
                roomPrice = roomPrice - roomPrice * 0.20;
            }
        }
        double totalPrice = overnights * roomPrice;
        if (positiveOrNegative.equals("positive")) {
            totalPrice = totalPrice + (totalPrice * 0.25);
        } else if (positiveOrNegative.equals("negative")) {
            totalPrice = totalPrice - (totalPrice * 0.10);
        }
        System.out.printf("%.2f", totalPrice);
    }
}
