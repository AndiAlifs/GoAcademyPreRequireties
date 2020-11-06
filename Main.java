import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calculator kalkulator = new Calculator();
        Scanner scan = new Scanner(System.in);
        String[] command;
        while (true) {
            command = scan.nextLine().split(" ");
            if (command[0].equalsIgnoreCase("add")){
                kalkulator.add(Integer.parseInt(command[1]));
            } else if (command[0].equalsIgnoreCase("subtract")){
                kalkulator.subtract(Integer.parseInt(command[1]));    
            } else if (command[0].equalsIgnoreCase("divide")){
                kalkulator.divide(Integer.parseInt(command[1]));
            } else if (command[0].equalsIgnoreCase("multiply")){
                kalkulator.multiply(Integer.parseInt(command[1]));
            } else if (command[0].equalsIgnoreCase("cancel")){
                kalkulator.cancel();
            } else {
                break;
            }
            
        }
        scan.close();
    }
}