import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        int n;
        int unit;
        int tense;
        int h;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number : ");
        n = sc.nextInt();

        unit = n %10;
        tense = n %100/10;
        h = n %1000/100;

        System.out.println("The number in the units place is " +unit);
        System.out.println("The number in the Tense place is " +tense);
        System.out.println("The number in the Hundreds place is " +h);
    }
}
