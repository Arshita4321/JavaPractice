import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S1 = scanner.nextLine();
        String S2 = scanner.nextLine();

        if (isRotation(S1, S2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }

    public static boolean isRotation(String S1, String S2) {
        if (S1.length() != S2.length()) {
            return false;
        }

        String finalString = S1 + S1;
        return finalString.contains(S2);
    }
}

