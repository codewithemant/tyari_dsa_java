package basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class areaofcircle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius: ");
        double r = sc.nextDouble();
        double a = 3.1452 * r *r;
        System.out.println("Area is: ");
        System.out.println(a);
    }
}
