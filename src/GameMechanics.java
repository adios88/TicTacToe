import java.util.Scanner;

public class GameMechanics {

    Scanner scanner = new Scanner(System.in);
    Validator validator = new Validator();
    int getUserInput() {
            int userInput = scanner.nextInt();
            return userInput;
    }
    int setFieldCords() {
        int userInput;
        do{
            userInput = getUserInput();
        }
        while (!validator.checkIfCorrectCords(userInput));
        return userInput;
    }

    void displayMenu(){
        System.out.println("Menu:");
        System.out.println("1. New Game");
        System.out.println("2. Exit");
    }

    void startGame(){
        displayMenu();
        int userInput = getUserInput();
        switch (userInput){
            case 1:
                game();
                break;
            case 2:
                break;
        }
    }

    void game(){
        Board gameBoard = new Board();
        int userInput1;
        int userInput2;
        int roundCounter=1;
        String writeX = "X";
        String writeO = "O";
        String empty = " - ";
        String currentPlayer;
        do {
            gameBoard.displayGameBoard();
            if(roundCounter%2>0) {
                System.out.println("Player's O turn.");
                currentPlayer = writeO;
            }
            else {
                System.out.println("Player's X turn.");
                currentPlayer = writeX;
            }
            System.out.println("Write field cords!");
            userInput1 = setFieldCords();
            userInput2 = setFieldCords();
            if(gameBoard.getArrayField(userInput1,userInput2).equals(empty)) {
                gameBoard.setArrayField(userInput1, userInput2, currentPlayer);
                roundCounter++;
            }
            else {
                System.out.println("Field occupied! Chose another field!");
            }

        }
        while(!gameBoard.checkIfWin() && !gameBoard.checkIfDraw());
        System.out.println("Jebać");
    }


}
