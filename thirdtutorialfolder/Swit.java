package thirdtutorialfolder;

import java.util.Scanner;

public class Swit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        String a = "Kunal";
        String b = "Kunal";

        switch(fruit){
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Grapes":
                System.out.println("Small Fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }
        int day = in.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid days");
        }
        
    }  
}
