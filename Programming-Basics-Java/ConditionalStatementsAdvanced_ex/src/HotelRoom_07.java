import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int overnights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month) {
            case "May", "October" -> {
                studioPrice = 50.0;
                apartmentPrice = 65.0;
                if (overnights > 7 && overnights <= 14) {
                    studioPrice = studioPrice - (studioPrice * 0.05);
                } else if (overnights > 14) {
                    studioPrice = studioPrice - (studioPrice * 0.30);
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
            }
            case "June", "September" -> {
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (overnights > 14) {
                    studioPrice = studioPrice - (studioPrice * 0.20);
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
            }
            case "July", "August" -> {
                studioPrice = 76.0;
                apartmentPrice = 77.0;
                if (overnights > 14) {
                    apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
                }
            }
        }
        double resultStudio = overnights * studioPrice;
        double resultApartment = overnights * apartmentPrice;
        System.out.printf("Apartment: %.2f lv.%n" +
                "Studio: %.2f lv.", resultApartment, resultStudio);
    }
}