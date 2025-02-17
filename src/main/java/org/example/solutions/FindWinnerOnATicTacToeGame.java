package org.example.solutions;

/**
 * 1275. Find Winner on a Tic Tac Toe Game
 * Tic-tac-toe is played by two players A and B on a 3 x 3 grid. The rules of Tic-Tac-Toe are:
 *     Players take turns placing characters into empty squares ' '.
 *     The first player A always places 'X' characters, while the second player B always places 'O' characters.
 *     'X' and 'O' characters are always placed into empty squares, never on filled ones.
 *     The game ends when there are three of the same (non-empty) character filling any row, column, or diagonal.
 *     The game also ends if all squares are non-empty.
 *     No more moves can be played if the game is over.
 * Given a 2D integer array moves where moves[i] = [rowi, coli] indicates that the ith move will be played on
 * grid[rowi][coli]. return the winner of the game if it exists (A or B). In case the game ends in a draw return "Draw".
 * If there are still movements to play return "Pending".
 * You can assume that moves is valid (i.e., it follows the rules of Tic-Tac-Toe), the grid is initially empty, and
 * A will play first.
 *
 * Example 1:
 * Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
 * Output: "A"
 * Explanation: A wins, they always play first.
 *
 * Example 2:
 * Input: moves = [[0,0],[1,1],[0,1],[0,2],[1,0],[2,0]]
 * Output: "B"
 * Explanation: B wins.
 *
 * Example 3:
 * Input: moves = [[0,0],[1,1],[2,0],[1,0],[1,2],[2,1],[0,1],[0,2],[2,2]]
 * Output: "Draw"
 * Explanation: The game ends in a draw since there are no moves to make.
 */
public class FindWinnerOnATicTacToeGame {
    char now = 'B';
    String DRAW = "Draw";
    String PENDING = "Pending";
    int movesLength;
    char [][] field = {{'1', '2', '3'},{'4', '5', '6'},{'7', '8', '9'}};
    public String tictactoe(int[][] moves) {
        movesLength = moves.length;
        for (int i = 0; i < moves.length; i++) {
            field[moves[i][0]][moves[i][1]] = getNextChar();
        }
        return checkField();
    }
    public char getNextChar () {
        if (now == 'B') {
            now = 'A';
        } else {
            now = 'B';
        }
        return now;
    }
    public String checkField () {
        if (field[0][0] == field[0][1] && field[0][1] == field[0][2]) {
            return field[0][0] + "";
        }
        if (field[1][0] == field[1][1] && field[1][1] == field[1][2]) {
            return field[1][0] + "";
        }
        if (field[2][0] == field[2][1] && field[2][1] == field[2][2]) {
            return field[2][0] + "";
        }
        if (field[0][0] == field[1][0] && field[1][0] == field[2][0]) {
            return field[0][0] + "";
        }
        if (field[0][1] == field[1][1] && field[1][1] == field[2][1]) {
            return field[0][1] + "";
        }
        if (field[0][2] == field[1][2] && field[1][2] == field[2][2]) {
            return field[0][2] + "";
        }
        if (field[0][0] == field[1][1] && field[1][1] == field[2][2]) {
            return field[0][0] + "";
        }
        if (field[0][2] == field[1][1] && field[1][1] == field[2][0]) {
            return field[0][2] + "";
        }
        if (movesLength == 9) {
            return DRAW;
        }
        return PENDING;
    }
}
