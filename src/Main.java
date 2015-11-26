/**
 * Created by RAMYA P S on 26-11-2015.
 */

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean result = uniqueCharacters.isUnique(input);
        if (result)
            System.out.print("The String contains only unique characters");
        else
            System.out.print("The String contains the duplicate characters");
    }
}