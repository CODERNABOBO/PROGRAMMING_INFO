import java.util.Scanner;

public class Calculator{
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Input number 1:");
        String input1 = scanner.nextLine();
        
        System.out.print("Input number 2:");
        int num2;
        
        if (scanner.hasNextInt()){
            num2 = scanner.nextInt();
            scanner.nextLine();
        } else{
            System.out.println("The operation is invalid. Check the operator values input!");
            scanner.close();
            return;
        }
        System.out.print("Operation to perform:");
        String operation = scanner.nextLine().toLowerCase();
        
        int num1;
        
        if (isNumeric(input1)){
            num1 = Integer.parseInt(input1);
        } else{
            System.out.println("The operation is invalid.Check the operator values input!");
            scanner.close();
            return;
            
        }
         
        int result = 0;
        
        switch (operation){
            case "+":
            case "addition":
                operation = "+"; // change "addition" or "+" to "+"
                result = num1 + num2;
                break;
            case "-":
            case "subtraction":
                result = num1-num2;
                break;
            case "*":
            case "multiplication":
                result = num1*num2;
                break;
            case "/":
            case "division":
                if (num2 != 0) {
                    result = num1/num2;
                    
                } else {
                    System.out.println ("Division by zero is not allowed.");
                    scanner.close();
                    return;
                }
                break;
            default: 
                System.out.println ("The operartion is invalid. Check the operator values input!");
                scanner.close();
                return;
        }
        
        System.out.println(num1 + "" + operation + " " + num2 + " = " + result);
        scanner.close();
        
    }
    
    public static boolean isNumeric(String str){
        try {
            Integer.parseInt (str);
            return true;
        
        } catch (NumberFormatException e) {
            return false;
        } 
        
    }
}