import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int discount;
        if(amount > 5000){
            discount = (20*amount)/100;
            
        }else if(amount >=3000 && amount<=5000){
            discount = (10 * amount)/100;
        }else{
            discount=0;
        }

        amount-=discount;
        System.out.println("Discount: Rs."+ discount);
        System.out.println("Final Amount Rs."+amount);
        scanner.close();
    }
}
