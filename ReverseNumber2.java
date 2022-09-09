import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String[] args) {
        int n;
        int rev = 0;
        int ld;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number : ");
        n = sc.nextInt();

        for( rev = 0; n != 0; rev = rev*10 + ld){
            ld = n %10;
            n = n/10;
        }
        System.out.println("Reverse is : " +rev);
    }
}
