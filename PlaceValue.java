package Day2;

import java.util.Scanner;
public class PlaceValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Available Lists ...");
        System.out.print("1        10         100                  1000");
        System.out.println("\nEnter Number From above Lists ");
        int num= sc.nextInt();
        if(num==1) {
            System.out.println("You Enter UNIT");
        } else if (num==10) {
            System.out.println("You Enter TEN");
        } else if (num==100) {
            System.out.println("You Enter HUNDRED");
        }
        else if (num==1000) {
            System.out.println("You Enter THOUSAND");
        }
        else {
            System.out.println("Invalid Input.....");
        }
    }
}
