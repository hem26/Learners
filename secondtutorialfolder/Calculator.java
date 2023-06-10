package secondtutorialfolder;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
         * Syntax for loops:
         * 
         * for (initialization; condition; increment/decrement){
         *  //body
         * }
         */
        for(int num=1; num<=5; num+=2){
            System.out.println(num);
        }
        
        Scanner in = new Scanner(System.in);
        //Take input from user till user does not press x or x
        while(true){

            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op=='+'|| op =='-'|| op=='*'||op=='/'||op=='%'){
                System.out.print("Enter the two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(op=='+'){
                   System.out.println(num1+num2);
                }
                if(op=='-'){
                   System.out.println(num1+ num2);
                }
                if(op=='*'){
                    System.out.println(num1*num2);
                }
                if(op=='/'){
                    System.out.println(num1/num2);
                }
                if(op=='%'){
                   System.out.println(num1%num2);
                }
            }else if(op=='x'|| op=='X'){
                System.out.println("Invalid operation");
                break;
            }
        }
       
    }
}
