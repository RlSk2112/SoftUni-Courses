import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String pass = "";
        for (int i = username.length() - 1; i >= 0; i--) {
            char currentSymbol = username.charAt(i);
            pass = pass + currentSymbol;
        }
        int wrongPassCount = 0;
        String currentPass = scanner.nextLine();
        while (!currentPass.equals(pass)) {
           wrongPassCount++;
           if (wrongPassCount >=4) {
               System.out.printf("User %s: blocked!",username);
               break;
           }
            System.out.println("Incorrect password! Please try again!");
            currentPass = scanner.nextLine();
        }
        if (wrongPassCount <=3) {
            System.out.printf("Username: %s logged in!",username);
        }
    }
}
