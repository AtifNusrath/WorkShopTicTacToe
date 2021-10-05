package bridgelabz;

import java.util.Scanner;

public class tictactoe {
    private static char userTurn;
    private static char computerTurn;
    public static char[] gameArray = new char[10];

    public static void ticTacToe() {
        for (int i = 0; i < gameArray.length; i++) {

            gameArray[i] = ' ';
        }
    }

    public static char user(Scanner scanner) {
        System.out.println("Enter your choice  X or O only");
        return scanner.next().toUpperCase().charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ticTacToe();
        userTurn = user(scanner);
        computerTurn = (userTurn == 'X') ? 'O' : 'X';
    }
}
