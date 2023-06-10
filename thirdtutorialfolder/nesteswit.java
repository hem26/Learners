package thirdtutorialfolder;

import java.util.Scanner;

public class nesteswit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch(empID){
            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Hemant");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                    default:
                        System.out.println("No department");
                        break;
            
                }
        }
    }   
}
