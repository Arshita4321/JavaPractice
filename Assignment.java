
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks between (0-100): ");
        int marks = scanner.nextInt();

        if(marks >=90){
            System.out.println("Grade: A");
        }else if(marks>=80){
            System.out.println("Grade: B");
        }
        else if(marks>=70){
            System.out.println("Grade: C");
        }else if(marks>=60){
            System.out.println("Grade: D");
        }
        else if(marks>=50){
            System.out.println("Grade: E");
        }else{
            System.out.println("Grade: F");
        }

    }
}
