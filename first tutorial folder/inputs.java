import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("The roll no is "+rollno);

        int a  = 10;
        System.out.println(a);
        //while loops
    /*
     * Syntax:
     * while (condition){
     *     //body
     * }
     */
        int num1=1;
        while(num1<=5){
            System.out.println(num1);
            num1+=1;
        }
        /*
         * 
         * do while loop 
         * 
         * do{
         *  while(condition);
         * }
         */
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while(n<=5);

    }    
}
