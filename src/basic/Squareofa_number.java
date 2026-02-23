package basic;
import java.util.Scanner;

public class Squareofa_number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        double n = sc.nextInt();
        double s = n * n;

        System.out.println("Square is: ");

        System.out.println(s);
    }
}