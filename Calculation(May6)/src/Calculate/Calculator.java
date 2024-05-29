
package Calculate;


public class Calculator {
    
    public int number1;
    public int number2;
    public String operation;

    public Calculator() {
    }

//    public Calculator(int number1, int number2, int operation) {
//        this.number1 = number1;
//        this.number2 = number2;
//        this.operation =
//    }
    
    
    public int doCalculate(){
        int result = 0;
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        return result;
    }
    
}
