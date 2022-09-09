import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n;
        int rev = 0;
        int ld;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number : ");
        n = sc.nextInt();

        while (n != 0){
            ld = n %10;
            rev = rev*10 + ld;
            n = n/10;
        }
        System.out.println("Reverse is : " +rev);
    }
}
