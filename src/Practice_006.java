package src;

import java.util.Scanner;

public class Practice_006 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int Number = Sc.nextInt();
        if ( Number  > 20){
            System.out.println("Number > 20");
        }else if (Number > 10 ){
            System.out.println("Number > 10");
        } else {
            System.out.println("Number is < 20");
        }
        Sc.close();
    }
}
