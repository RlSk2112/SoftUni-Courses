import java.util.Scanner;

public class FruitShop_011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if (product.equals("banana")) {
            switch (dayOfWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    price = 2.50;
                    break;
                case "Saturday":
                case "Sunday":
                    price = 2.70;
                    break;
                default:
                    System.out.printf("error");
                    break;
            }
            double result = quantity * price;
            System.out.printf("%.2f", result);
        } else if (product.equals("apple")) {
            switch (dayOfWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    price = 1.20;
                    break;
                case "Saturday":
                case "Sunday":
                    price = 1.25;
                    break;
                default:
                    System.out.printf("error");
                    break;
            }
            double result = quantity * price;
            System.out.printf("%.2f", result);
        } else if (product.equals("orange")) {
            switch (dayOfWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    price = 0.85;
                    break;
                case "Saturday":
                case "Sunday":
                    price = 0.90;
                    break;
                default:
                    System.out.printf("error");
                    break;
            }
            double result = quantity * price;
            System.out.printf("%.2f", result);
        } else if (product.equals("grapefruit")) {
            switch (dayOfWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    price = 1.45;
                    break;
                case "Saturday":
                case "Sunday":
                    price = 1.60;
                    break;
                default:
                    System.out.printf("error");
                    break;
            }
            double result = quantity * price;
            System.out.printf("%.2f", result);
        } else if (product.equals("kiwi")) {
            switch (dayOfWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    price = 2.70;
                    break;
                case "Saturday":
                case "Sunday":
                    price = 3.00;
                    break;
                default:
                    System.out.printf("error");
                    break;
            }
            double result = quantity * price;
            System.out.printf("%.2f", result);
        } else if (product.equals("pineapple")) {
            switch (dayOfWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    price = 5.50;
                    break;
                case "Saturday":
                case "Sunday":
                    price = 5.60;
                    break;
                default:
                    System.out.printf("error");
                    break;
            }
            double result = quantity * price;
            System.out.printf("%.2f", result);
        } else if (product.equals("grapes")) {
            switch (dayOfWeek) {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                    price = 3.85;
                    break;
                case "Saturday":
                case "Sunday":
                    price = 4.20;
                    break;
                default:
                    System.out.printf("error");
                    break;
            }
            double result = quantity * price;
            System.out.printf("%.2f", result);
        } else {
            System.out.println("error");
        }

    }
}
