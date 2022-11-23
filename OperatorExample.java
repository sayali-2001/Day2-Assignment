package Day2;

public class OperatorExample {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        int c = 25;
        int max  =0;
        int value1 = a+b*c;
        int value2 = c+a/b;
        int value3 = a%b+c;
        int value4 = a*b+c;
        if(value1 > value2 && value1 > value3 && value1 > value4 ){
                max = value1;
            System.out.println("Largest Value is Value1 : " +max);
        }
        else if (value2 > value1 && value2 > value3 && value2 > value4 ) {
                max = value2;
            System.out.println("Largest Value is Value2 " +max);
        }
        else if (value3 > value1 && value3 > value2 && value3 > value4 ) {
                max = value3;
            System.out.println("Largest Value is Value3 " +max);
        }
        else  {
            max = value4;
            System.out.println("Largest Value is Value4 " +max);
        }
    }
}
