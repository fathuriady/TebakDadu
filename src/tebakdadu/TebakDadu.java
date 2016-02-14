/*
Dibuat oleh : Fathuriady
Tanggal     : 13-Feb-2016
*/

package tebakdadu;

import java.util.Random;
import java.util.Scanner;


public class TebakDadu 
{


    public static void main(String[] args) 
    {
     Scanner input =  new Scanner(System.in);
        Random dadu = new Random();
        
        System.out.println("Enter Your name : ");
        String nama =  input.nextLine();
        System.out.println("Hello " + nama + ", now We will play a game"
                + " the rule is simple You just need to guess My"
                + " dice number");
        
        System.out.println("So lets begin.....\n\n");
        System.out.println("Please enter Your guess number (1-6) : ");
        int angka = input.nextInt();
        System.out.println("\nSo You are guessing that My number is "+ angka+".");
        int angkas = 1+ dadu.nextInt(6);
        System.out.println("\nPlease, let me throw my dice "
                + "and we'll see if my number is the same as your guessed number.");
        if(angka < 1 || angka > 6)
        {
            System.out.println("\n\nYou've entered a wrong number.");
            System.exit(1);
        }
        
            
            System.out.println("\n\nMy dice number is : " + angkas);
            
            if(angka == angkas)
            {
                System.out.println("How lucky You are!! You guessed My number.");
            }
            else{System.out.println("Sorry, You have guessed a wrong number :).");}
    }

}
