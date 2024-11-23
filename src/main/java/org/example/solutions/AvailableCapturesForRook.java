package org.example.solutions;

/**
 * 999. Available Captures for Rook
 * You are given an 8 x 8 matrix representing a chessboard. There is exactly one white rook represented by 'R', some
 * number of white bishops 'B', and some number of black pawns 'p'. Empty squares are represented by '.'.
 * A rook can move any number of squares horizontally or vertically (up, down, left, right) until it reaches another
 * piece or the edge of the board. A rook is attacking a pawn if it can move to the pawn's square in one move.
 * Note: A rook cannot move through other pieces, such as bishops or pawns. This means a rook cannot attack a pawn if t
 * here is another piece blocking the path.
 * Return the number of pawns the white rook is attacking.
 *
 * Example 1:
 * Input: board =  [[".",".",".",".",".",".",".","."],
 *                 [".",".",".","p",".",".",".","."],
 *                 [".",".",".","R",".",".",".","p"],
 *                 [".",".",".",".",".",".",".","."],
 *                 [".",".",".",".",".",".",".","."],
 *                 [".",".",".","p",".",".",".","."],
 *                 [".",".",".",".",".",".",".","."],
 *                 [".",".",".",".",".",".",".","."]]
 *
 * Output: 3
 * Explanation:
 * In this example, the rook is attacking all the pawns.
 *
 * Example 2:
 * Input: board =  [[".",".",".",".",".",".","."],
 *                 [".","p","p","p","p","p",".","."],
 *                 [".","p","p","B","p","p",".","."],
 *                 [".","p","B","R","B","p",".","."],
 *                 [".","p","p","B","p","p",".","."],
 *                 [".","p","p","p","p","p",".","."],
 *                 [".",".",".",".",".",".",".","."],
 *                 [".",".",".",".",".",".",".","."]]
 * Output: 0
 * Explanation:
 * The bishops are blocking the rook from attacking any of the pawns.
 *
 * Example 3:
 * Input: board = [[".",".",".",".",".",".",".","."],
 *                 [".",".",".","p",".",".",".","."],
 *                 [".",".",".","p",".",".",".","."],
 *                 ["p","p",".","R",".","p","B","."],
 *                 [".",".",".",".",".",".",".","."],
 *                 [".",".",".","B",".",".",".","."],
 *                 [".",".",".","p",".",".",".","."],
 *                 [".",".",".",".",".",".",".","."]]
 * Output: 3
 * Explanation:
 * The rook is attacking the pawns at positions b5, d6, and f5.
 */
public class AvailableCapturesForRook {
    public int numRookCaptures(char[][] board) {
        int hBoard = board.length;
        int wBoars = board[0].length;
        int x = 0;
        int y = 0;
        for (int i = 0; i < hBoard; i++) {
            for (int j = 0; j < wBoars; j++) {
                if (board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        int count = 0;
        for (int j = x; j < hBoard; j++) {
            if (board[j][y] == 'B') {
                break;
            } else if(board[j][y] == 'p') {
                count++;
                break;
            }
        }
        for (int j = x; j >= 0; j--) {
            if (board[j][y] == 'B') {
                break;
            } else if (board[j][y] == 'p') {
                count++;
                break;
            }
        }
        for (int j = y; j < hBoard; j++) {
            if (board[x][j] == 'B') {
                break;
            } else if(board[x][j] == 'p') {
                count++;
                break;
            }
        }
        for (int j = y; j >= 0; j--) {
            if (board[x][j] == 'B') {
                break;
            } else if (board[x][j] == 'p') {
                count++;
                break;
            }
        }
        return count;
    }
}
