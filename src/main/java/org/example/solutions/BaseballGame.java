package org.example.solutions;

import java.util.ArrayList;

/**
 * 682. Baseball Game
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an
 * empty record. You are given a list of strings operations, where operations[i] is the ith operation you must apply to
 * the record and is one of the following:
 * An integer x.
 * Record a new score of x.
 * '+'.
 * Record a new score that is the sum of the previous two scores.
 * 'D'.
 * Record a new score that is the double of the previous score.
 * 'C'.
 * Invalidate the previous score, removing it from the record.
 *
 * Return the sum of all the scores on the record after applying all the operations.
 * The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that
 * all operations are valid.
 *
 * Example 1:
 * Input: ops = ["5","2","C","D","+"]
 * Output: 30
 * Explanation:
 * "5" - Add 5 to the record, record is now [5].
 * "2" - Add 2 to the record, record is now [5, 2].
 * "C" - Invalidate and remove the previous score, record is now [5].
 * "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
 * "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
 * The total sum is 5 + 10 + 15 = 30.
 *
 * Example 2:
 * Input: ops = ["5","-2","4","C","D","9","+","+"]
 * Output: 27
 * Explanation:
 * "5" - Add 5 to the record, record is now [5].
 * "-2" - Add -2 to the record, record is now [5, -2].
 * "4" - Add 4 to the record, record is now [5, -2, 4].
 * "C" - Invalidate and remove the previous score, record is now [5, -2].
 * "D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
 * "9" - Add 9 to the record, record is now [5, -2, -4, 9].
 * "+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
 * "+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
 * The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
 *
 * Example 3:
 * Input: ops = ["1","C"]
 * Output: 0
 * Explanation:
 * "1" - Add 1 to the record, record is now [1].
 * "C" - Invalidate and remove the previous score, record is now [].
 * Since the record is empty, the total sum is 0.
 */
public class BaseballGame {
    public boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public int calPoints(String[] o) {
        String summ = "+";
        String mult = "D";
        String deleteLast = "C";
        ArrayList<Integer> lst = new ArrayList<>();
        int answer = 0;
        int tmp = 0;
        int tmp2 = 0;
        int a = 0;
        for (int i = 0; i < o.length; i++) {
            if (isDigit(o[i])) {
                tmp = Integer.valueOf(o[i]);
                lst.add(tmp);
                //System.out.println("add num = " + tmp + "; lst=" + lst.toString());
            } else {
                if (o[i]. equals(summ)) {
                    tmp2 = 0;
                    a = lst.get(lst.size() - 1) + lst.get(lst.size() - 2);
                    tmp2 += a;
                    lst.add(tmp2);
                    //System.out.println("add summ = " + tmp2 + "; lst=" + lst.toString());
                } else if (o[i]. equals(mult)) {
                    tmp2 = lst.get(lst.size() - 1);
                    tmp2 *= 2;
                    lst.add(tmp2);
                    //System.out.println("add mult = " + tmp2 + "; lst=" + lst.toString());
                } else if (o[i]. equals(deleteLast)) {
                    lst.remove(lst.size() - 1);
                    //System.out.println("remove last num" + "; lst=" + lst.toString());
                } else {
                    System.out.print("Error in parsing operation!");
                    return -1;
                }
            }
        }
        tmp2 = 0;
        for (int i = 0; i < lst.size(); i++) {
            tmp2 += lst.get(i);
        }
        return tmp2;
    }
}
