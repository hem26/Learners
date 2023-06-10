package secondtutorialfolder;

public class Main {
    public static void main(String[] args) {
        /*
         Syntax of if statements:
         if (boolean expression T or F){

         }
         */

        int salary = 25400;
        /*  
         if(salary>10000){
            salary = salary + 20000;
         }else{
            salary = salary + 10000;
         }
         System.out.println(salary);*/
        if(salary>10000){
            salary+=2000;
        }else if(salary==1000){
            salary+=20000;
        }else{
            salary+=2000;
        }
        System.out.println(salary);

    }
}
