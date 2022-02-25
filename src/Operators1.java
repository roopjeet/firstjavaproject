import java.sql.SQLOutput;
import java.util.Scanner;

public class Operators1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int firstnumber = sc.nextInt();
        System.out.println("Enter Second number");
        int secondnumber = sc.nextInt();
        System.out.println("Enter Third number");
        int thirdnumber = sc.nextInt();
        checkequalnumbers(firstnumber, secondnumber, thirdnumber);
    }

    public static void checkequalnumbers(int a, int b, int c) {
        if (a == b && b == c)
            System.out.println("The Numbers are Equal");
        else System.out.println("The Numbers are not Equal");
    }


}
