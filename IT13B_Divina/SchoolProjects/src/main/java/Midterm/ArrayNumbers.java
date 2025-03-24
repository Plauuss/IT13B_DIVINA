/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

public class ArrayNumbers {
      public static void main(String[] args) {

        // 1. Single Array of Numbers
        int singleNumbers[] = {10, 20, 30, 40, 50, 60, 70};
        for (int index = 0; index < singleNumbers.length; index++) {
            System.out.print(singleNumbers[index] + ",");
        }
        System.out.println();

        // 2. Multi-dimensional Array of Numbers
        int numberGrid[][] = {
            {100, 200, 300, 400},
            {500, 600, 700, 800},
            {900, 1000, 1100, 1200}
        };

        for (int row = 0; row < numberGrid.length; row++) {
            System.out.print("Values in Set " + (row + 1) + ": ");
            for (int col = 0; col < numberGrid[row].length; col++) {
                System.out.print(numberGrid[row][col] + " ");
            }
            System.out.println(); 
        }
    }
}
