package org.example.solutions;

/**
 * 174. Dungeon Game174. Dungeon Game
 * The demons had captured the princess and imprisoned her in the bottom-right corner of a dungeon. The dungeon consists
 * of m x n rooms laid out in a 2D grid. Our valiant knight was initially positioned in the top-left room and must fight
 * his way through dungeon to rescue the princess.
 * The knight has an initial health point represented by a positive integer. If at any point his health point drops to
 * 0 or below, he dies immediately.
 * Some of the rooms are guarded by demons (represented by negative integers), so the knight loses health upon entering
 * these rooms; other rooms are either empty (represented as 0) or contain magic orbs that increase the knight's
 * health (represented by positive integers).
 * To reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.
 * Return the knight's minimum initial health so that he can rescue the princess.
 * Note that any room can contain threats or power-ups, even the first room the knight enters and the bottom-right room
 * where the princess is imprisoned.
 * <p>
 * Example 1:
 * Input: dungeon = [[-2,-3,3],[-5,-10,1],[10,30,-5]]
 * Output: 7
 * Explanation: The initial health of the knight must be at least 7 if he follows the optimal path:
 * RIGHT-> RIGHT -> DOWN -> DOWN.
 * <p>
 * Example 2:
 * Input: dungeon = [[0]]
 * Output: 1
 */
public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dungeonRepresentation = new int[dungeon.length][dungeon[0].length];
        for (int i = dungeonRepresentation.length - 1; i >= 0; i--) {
            for (int j = dungeonRepresentation[0].length - 1; j >= 0; j--) {
                if (i == dungeonRepresentation.length - 1 && j == dungeonRepresentation[0].length - 1) {
                    dungeonRepresentation[i][j] = Math.min(dungeon[i][j], 0);
                } else if (i == dungeonRepresentation.length - 1) {
                    dungeonRepresentation[i][j] = Math.min(dungeon[i][j] + dungeonRepresentation[i][j + 1], 0);
                } else if (j == dungeonRepresentation[0].length - 1) {
                    dungeonRepresentation[i][j] = Math.min(dungeon[i][j] + dungeonRepresentation[i + 1][j], 0);
                } else {
                    int right = dungeon[i][j] + dungeonRepresentation[i][j + 1];
                    int bottom = dungeon[i][j] + dungeonRepresentation[i + 1][j];
                    dungeonRepresentation[i][j] = (right >= 0 || bottom >= 0) ? 0 : Math.max(right, bottom);
                }
            }
        }
        return dungeonRepresentation[0][0] >= 0 ? 1 : -1 * (dungeonRepresentation[0][0]) + 1;
    }
}
