import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int x = 102;
        if (x>1 && x<100){
            System.out.println("congrats");}

            System.out.println("Please enter month number (1-12)");
            Scanner sc = new Scanner(System.in);
            int month = sc.nextInt();

            if (month == 1 || month == 3 || month == 5){
            System.out.println("31 days");
            }
            else if(month == 4 || month == 6 || month == 8){
                System.out.println("This month has 30 days");}
                        else if(month == 2){
                    System.out.println("This month has 28 days");  }
            }
    }

