import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int permissions = scanner.nextInt();
        int bitPosition = scanner.nextInt();

        if(permissions < 0 || permissions >15 || bitPosition <0 || bitPosition > 3){
            System.out.println("Invalid input.  Please enter valid permissions (0-15) and bit position (0-3). ");
            return;
        }

        System.out.println("Orignal permissions: " + String.format("%4s", Integer.toBinaryString(permissions)).replace(' ', '0'));

        int updatedPermission = permissions ^ (1<<bitPosition);
        System.out.println("Updated permissions: "+ String.format("%4s", Integer.toBinaryString(updatedPermission)).replace(' ', '0'));

        scanner.close();
    }
}
