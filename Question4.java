import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age  = scanner.nextInt();
        int income = scanner.nextInt();
        boolean dues = scanner.nextBoolean();

        String ans = (age >=18 && income >=30000 && !dues) ? "You are eligible for premium membership." : "You are not eligible for premium membership.";

        System.out.println(ans);
    }
    
}
