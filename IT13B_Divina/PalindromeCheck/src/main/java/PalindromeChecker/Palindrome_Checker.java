/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PalindromeChecker;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Palindrome_Checker {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a string: ");
        String name = scanner.nextLine();
        printString(name);
    }
   public static void printString(String str){
       for (int i = 0; i < str.length(); i++){
           System.out.print(str.charAt(i));
       }
   }

}
