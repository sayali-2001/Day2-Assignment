import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        int num;
        int rev=0;
        int ld;


        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number : ");
        num = sc.nextInt();
        int num1 = num;

        while(num != 0){
            ld=num%10;
            rev = rev*10+ld;
            num = num/10;
        }

//        System.out.println("reverse is" +rev);

        if(rev==num1){
            System.out.println(num1+ " is Palindrom Number");
        }
        else{
            System.out.println(num1+  " is not Palindrom Number");
        }


    }
}
