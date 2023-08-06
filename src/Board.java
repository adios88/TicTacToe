public class Board {
    String[][] gameboard = new String[3][3];

    GameMechanics gameMechanics= new GameMechanics();
    Board(){
        initializeGameBoard();
    }
    void displayGameBoard(){
        for (int row = 0; row < gameboard.length; row++) {
            for (int col = 0; col < gameboard[row].length; col++) {
                System.out.print("[" + gameboard[row][col] + "] ");
            }
            System.out.println("");
        }
    }

    void initializeGameBoard(){
        for (int row = 0; row < gameboard.length; row++) {
            for (int col = 0; col < gameboard[row].length; col++) {
                gameboard[row][col] = " - ";
            }
        }
    }

    void setArrayField(int row, int col, String value){
        gameboard[row][col] = " " + value + " ";
    }

    String getArrayField(int row, int col){
        String value = gameboard[row][col];
        return value;
    }

    boolean checkIfWin(){
        for (int row=0; row < gameboard.length; row++){
            if(gameboard[row][0] == gameboard[row][1] && gameboard[row][0]== gameboard [row][2] && gameboard[row][0] != " - "){
                return true;
            }
        }
        for (int col=0; col < gameboard.length; col++){
            if(gameboard[0][col] == gameboard[1][col] && gameboard[1][col]== gameboard [2][col] && gameboard[0][col] != " - "){
                return true;
            }
        }
        if(gameboard[0][0] == gameboard[1][1] && gameboard[1][1]== gameboard [2][2] && gameboard[1][1] != " - "){
            return true;
        }
        if(gameboard[0][2] == gameboard[1][1] && gameboard[1][1]== gameboard [2][0] && gameboard[1][1] != " - "){
            return true;
        }
        return false;
    }

    boolean checkIfDraw(){
        for (int row = 0; row < gameboard.length; row++) {
            for (int col = 0; col < gameboard[row].length; col++) {
                if(gameboard[row][col] == " - ")
                    return false;
            }
        }
        System.out.println("Its a draw!");
        return true;
    }

   boolean checkIfCorrectCords(){
        int userInput = gameMechanics.getUserInput();
        if(userInput == 0 || userInput == 1 || userInput == 2){
            return true;
        }
        else {
            System.out.println("Please enter the correct cords!");
            return false;
        }
    }
}
