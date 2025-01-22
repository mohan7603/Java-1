// Revere a string with using Build-in-Function :

import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String to Reverse : ");
        String Original = scan.nextLine();
        System.out.println("");

        // use StringBuilder(Build-in-Function) to reverse the String

        String Reversed = new StringBuilder(Original).reverse().toString();

        System.out.println("Original String : ");
        System.out.println(Original);
        System.out.println("");
        System.out.println("Reversed String : ");
        System.out.println(Reversed);



    }
}