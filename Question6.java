
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sen = scanner.nextLine();

        String[] words = sen.split(" ");

        String longest = "";
        int maxLength =0;
        for(String word : words){
            if(word.endsWith(".") && word.length() -1 > maxLength){
                maxLength = word.length();
                longest = word;
            }

            else if(word.length()>maxLength){
                maxLength = word.length();
                longest = word;
            }
        }

        System.out.println(longest);
        scanner.close();
    }
}
