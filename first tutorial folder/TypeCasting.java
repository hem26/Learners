import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num =input.nextFloat();
//        System.out.println(num);
//Type Casting--->
        int num = (int)(67.38f);
        System.out.println(num);

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b); //257 % 256 = 1

        int number = 'A';
        System.out.println(number);

        System.out.println(3+5.4322);
        

    }
}
