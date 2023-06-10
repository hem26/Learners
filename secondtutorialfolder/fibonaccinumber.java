package secondtutorialfolder;

import java.util.Scanner;

public class fibonaccinumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter new range");
        int a = n.nextInt();
        int b = 0;
        int c = 1;
        /*This is for loop method */
        /* 
        System.out.println(b);
        for(int i=0; i<=a; i++){
            int sum = b+c;
            b=c;
            c=sum;
            System.out.println(sum);
        }*/
        /*While loop method */
        int i=0;
        System.out.println(b);
        while(i<=a){
            int sum = b+c;
            b=c;
            c=sum;
            System.out.println(sum);
            i++;
        }

    }
}

