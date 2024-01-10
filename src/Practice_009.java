package src;

import java.util.Scanner;

public class Practice_009 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Side1,Side2, Side 3, i will tell the traigle type");
        int Side1 = Sc.nextInt();
        int Side2 = Sc.nextInt();
        int Side3 = Sc.nextInt();

        if ((Side1 == Side2) && (Side2==Side3) && (Side1 == Side3)){
            System.out.println("Eq.");

        }else if ((Side1==Side2)||(Side2==Side3)||(Side1==Side3)){
            System.out.println("ISO");
        }else{
            System.out.println("Scelene");
        }
        Sc.close();
    }
}
