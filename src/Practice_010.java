package src;

import java.util.Scanner;

public class Practice_010 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Please enter 1 to 7, I will Display the Week Name");
        int dayNumber = Sc.nextInt();
        switch (dayNumber){
            case 1:
            System.out.println("Mon");
            break;

            case 2:
            System.out.println("Tue");
            break;

            case 3:
            System.out.println("Wed");
            break;

            case 4:
            System.out.println("Thu");
            break;

            case 5:
            System.out.println("Fri");
            break;

            case 6:
            System.out.println("Sat");
            break;

            default:
            System.out.println("Are you Mad!!");
            break;


        }
        System.out.println(" - End of Program - ");
    }

}
