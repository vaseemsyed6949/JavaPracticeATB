package src;

import java.util.Scanner;

public class Practice_007 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Students Marks");
        double Marks = Sc.nextDouble();
        if (Marks > 90 && Marks <= 100){
            System.out.println("Grade 'A' ");
        }else if ( Marks > 80 && Marks < 90){
            System.out.println("Grade 'B'");
        }else if ( Marks > 50 && Marks < 80){
            System.out.println("Grade 'C'");
        }else {
            System.out.println("Fail");
        }
        Sc.close();
    }
}
