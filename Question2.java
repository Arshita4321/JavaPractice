import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        char c = scanner.next().charAt(0);
        boolean d = scanner.nextBoolean();

        System.out.println("Before: ");
        System.out.println("Integer: "+ a);
        System.out.println("Double: "+b);
        System.out.println("Character: "+ c);
        System.out.println("Boolean: "+ d);

        double IntToDouble = a;
        int ConvertToInt = c;

        System.out.println("After type Conversion: ");
        System.out.println("Integer conversion to double: "+IntToDouble);
        System.out.println("Charachter converted to integer: "+ ConvertToInt);

        scanner.close();
    }
}
