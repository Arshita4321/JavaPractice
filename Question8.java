import java.util.Scanner;

public class Question8 {
    public static int reverseInteger(int n){
        int reversed = 0;
        while(n != 0){
            int digit = n%10;

            if(reversed > Integer.MAX_VALUE /10 || (reversed == Integer.MAX_VALUE /10 && digit > 7)) return 0;
            if(reversed < Integer.MIN_VALUE /10 || (reversed == Integer.MIN_VALUE / 10 && digit <-8)) return 0;


            reversed = reversed * 10 +digit;
            n /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Reversed integer: "+reverseInteger(n));
        scanner.close();
    }
}
