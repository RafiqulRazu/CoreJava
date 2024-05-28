/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package april29;

import java.util.Random;

/**
 *
 * @author USERAS
 */
public class PasswordGenerate {

    public static void main(String[] args) {
        Random random = new Random();
        String password = "";
        String finalPassword = "";
//        System.out.println(range);

        for (int i = 0; i < 8; i++) {
            int range = random.nextInt(4) + 1;

            switch (range) {
                case 1:
                    password += (char) (random.nextInt(26) + 65);
                    break;
                case 2:
                    password += (char) (random.nextInt(26) + 97);
                    break;
                case 3:
                    password += (char) (random.nextInt(10) + 48);
                    break;
                case 4:
                    password += (char) (random.nextInt(15) + 33);
                    break;
                    
            }
        }
        
        
        for(int i = 0; i < password.length(); i++){
            if(i == password.length()/2){
                finalPassword += "_" + password.charAt(i);
            }
            else {
                finalPassword += password.charAt(i);
            }
        }
        
        System.out.println(password);
    }

}
