import java.util.Scanner;

public class NaturalNumber2 {
    public static void main(String[] args) {
        int i;
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit of natural number : ");
        n = sc.nextInt();

        for( i =1 ; i <= n ; i++){
            sum = sum + i;
        }
        System.out.println("Sum of Natural Number : " +sum);
    }
}
