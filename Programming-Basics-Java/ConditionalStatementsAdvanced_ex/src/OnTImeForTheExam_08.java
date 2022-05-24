import java.util.Scanner;

public class OnTImeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHours = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examAllMinutes = examHours * 60 + examMinutes;
        int arrivalAllMinutes = arrivalHours * 60 + arrivalMinutes;

        int diff = Math.abs(examAllMinutes - arrivalAllMinutes);
        if (examAllMinutes < arrivalAllMinutes) {
            System.out.println("Late");
            if (diff >= 60) {
                int diffHour = diff / 60;
                int diffMin = diff % 60;
                System.out.printf("%d:%02d hours after the start", diffHour, diffMin);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if (arrivalAllMinutes == examAllMinutes || diff <= 30) {
            System.out.println("On time");
            if (diff >= 1 && diff <= 30) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                int diffHour = diff / 60;
                int diffMin = diff % 60;
                System.out.printf("%d:%02d hours before the start", diffHour, diffMin);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}
