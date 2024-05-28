/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package april27;

import java.util.Scanner;

/**
 *
 * @author USERAS
 */
public class April27 {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Starting: ");
//        int start = input.nextInt();
//        System.out.println("Ending: ");
//        int end = input.nextInt();
//        
//        while(start<=end){
//            System.out.println(start+" Hello Java");
//            start++;
//        }
//    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Starting: ");
        int start = input.nextInt();
        System.out.println("Ending: ");
        int end = input.nextInt();

        while (start <= end) {
            if(start % 5 != 0 && start % 3 != 0){
                System.out.println(start);
            }
            start++;
        }
        
    }
    
    
    
//    public static void main(String[] args) {
//        
//    }

}
