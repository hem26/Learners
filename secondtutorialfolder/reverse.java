package secondtutorialfolder;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the range for number: ");
       int a  =1234;
       int rev = 0;
       int rem;
       while(a>0){
        rem = a%10;
        rev = (rev*10) + rem;
        a = a/10;
       }
       System.out.println(rev);
       
    }    
}
