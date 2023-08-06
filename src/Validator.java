import java.util.Scanner;
public class Validator {
    boolean checkIfCorrectCords(int userInput){
    if(userInput == 0 || userInput == 1 || userInput == 2) {
            return true;
        }
        else{
        System.out.println("Please enter the correct cords!");
            return false;
        }
    }
}