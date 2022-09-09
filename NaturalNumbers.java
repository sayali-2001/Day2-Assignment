import java.sql.SQLOutput;
import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        int i = 1;
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit of natural number : ");
        n = sc.nextInt();

        while(i <= n){
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of Natural Number : " +sum);
    }
}
