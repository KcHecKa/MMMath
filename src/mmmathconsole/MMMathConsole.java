/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mmmathconsole;
import java.util.Scanner; 
/**
 *
 * @author kjcjr
 */
public class MMMathConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        boolean menuOne = true;
        Scanner myScanner = new Scanner(System.in);
        //menu
        System.out.println("Marvelous Mental Math");
        System.out.println("Choose your mode to practice \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division");
        
        while (menuOne) {
            
        Integer input1 = myScanner.nextInt();
            switch (input1) {
                case 1:
                    menuOne = false;
                    AdditionMode();
                    break;
                case 2:
                    menuOne = false;
                    SubtractionMode();
                    break;
                case 3:
                    menuOne = false;
                    MultiplicationMode();
                    break;
                case 4:
                    menuOne = false;
                    DivisionMode();
                    break;
                default:
                    System.out.println("Please enter a valid option!");
                    break;
            }
    }
        

    }
    
    public static void AdditionMode() {
        //main variables
        Scanner myScanner = new Scanner(System.in);
        int diff = 0;
        //
        System.out.println("Entering Addition");
        System.out.println("Select Difficulty 1: Easy \n 2: Normal");
        Integer inputDiff = myScanner.nextInt();
        //diff = DifficultySelect(inputDiff);
    }
    public static void SubtractionMode() {
        System.out.println("Entering Subtraction");
        
    }
    public static void MultiplicationMode() {
        System.out.println("Entering Multiplication");
        
    }
    public static void DivisionMode() {
        System.out.println("Entering Division");
        
    }
    
    public Integer DifficultySelect(int x) {
        
        return x;
    }
}
