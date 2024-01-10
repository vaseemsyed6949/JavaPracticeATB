package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice_004 {

    public static void main(String[] args) {



       Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = Sc.nextLine();
        System.out.println("Enter Your Age:");
        double age = Sc.nextDouble();
        System.out.println(" Hello,  "   + name + "!You are "  + age + " years old now ");
        Sc.close();


    }
}
