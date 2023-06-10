package secondtutorialfolder;

import java.util.Scanner;

public class counting_recurence {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int a = n.nextInt();
        int count=0;
        System.out.print("Enter the number: ");
        for(int i = 0; i<=a; i++){
            int b=n.nextInt();
            if(b==7){
                count=count+1;
                System.out.println("7 number of occurence is " + count+ " times");
            }
        
        }
    }
}
