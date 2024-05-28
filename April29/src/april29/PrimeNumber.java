/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package april29;

import java.util.Scanner;

/**
 *
 * @author USERAS
 */
public class PrimeNumber {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        
        if (prime(number)){
            System.out.println(number+" is a prime");
        }
        else{
            System.out.println(number+" is not a prime");
        }
    }
    
    public static boolean prime(int number){
        int count = 0;
        for(int i = 1; i<= number; i++){
            if(number %i == 0){
                count++;
            }
        }
        return count ==2;
    }
    
}
