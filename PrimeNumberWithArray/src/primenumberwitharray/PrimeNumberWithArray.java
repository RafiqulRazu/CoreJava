/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumberwitharray;

import java.util.Random;

/**
 *
 * @author USERAS
 */
public class PrimeNumberWithArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = new int[101];
        int n = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
            
            for(int n = 1; n <= array[i]; n++){
                
                if(array[i]%n == 0){
                    count += 1;
                }
                
            }
            
            
        }

    }
}