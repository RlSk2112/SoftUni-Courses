import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfProject = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double seats = rows * columns;
        double totalIncomes = 0;

        switch (typeOfProject) {
            case "Premiere":
                totalIncomes = seats * 12.00;
                break;
            case "Normal":
                totalIncomes = seats * 7.50;
                break;
            case "Discount":
                totalIncomes = seats * 5.00;
                break;
        }
        System.out.printf("%.2f",totalIncomes);
    }
}
