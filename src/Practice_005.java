package src;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice_005 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter User Name");
        String name = Sc.nextLine();
        System.out.println("Enter Age");
        int Age = Sc.nextInt();
        System.out.println("Hello!" + name + "Your Age is -->" + Age);

        Sc.close();


    }


}
