package org.example.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 787. Cheapest Flights Within K Stops
 * There are n cities connected by some number of flights. You are given an array flights where
 * flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city toi with cost pricei.
 *
 * You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops.
 * If there is no such route, return -1.
 *
 * Example 1:
 * Input: n = 4, flights = [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k = 1
 * Output: 700
 * Explanation:
 * The graph is shown above.
 * The optimal path with at most 1 stop from city 0 to 3 is marked in red and has cost 100 + 600 = 700.
 * Note that the path through cities [0,1,2,3] is cheaper but is invalid because it uses 2 stops.
 *
 * Example 2:
 * Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
 * Output: 200
 * Explanation:
 * The graph is shown above.
 * The optimal path with at most 1 stop from city 0 to 2 is marked in red and has cost 100 + 100 = 200.
 *
 * Example 3:
 * Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 0
 * Output: 500
 * Explanation:
 * The graph is shown above.
 * The optimal path with no stops from city 0 to 2 is marked in red and has cost 500.
 */
public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] a, int src, int dst, int k) {
        List<List<List<Integer>>> graph = new ArrayList<>();
        int i,m=a.length;
        for(i=0;i<n;i++)
            graph.add(new ArrayList<>());
        for(i=0;i<m;i++)
        {
            ArrayList<Integer> tmp=new ArrayList<>();
            tmp.add(a[i][1]); tmp.add(a[i][2]);
            graph.get(a[i][0]).add(tmp);
        }
        int dp[][]=new int[n][k+2];
        for(int it[]:dp)
            Arrays.fill(it,-1);
        int ans=dfs(graph,src,dst,k+1,dp);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public int dfs(List<List<List<Integer>>> graph,int src,int dst,int k,int dp[][])
    {
        if(k<0)  return Integer.MAX_VALUE;
        if(src==dst) return 0;
        if(dp[src][k]!=-1) return dp[src][k];
        int min=Integer.MAX_VALUE;
        for(List<Integer> it:graph.get(src))
        {
            int cho=it.get(0); int price=it.get(1);
            int cheap=dfs(graph,cho,dst,k-1,dp);
            if(cheap!=Integer.MAX_VALUE)
                min=Math.min(min,cheap+price);
        }
        return dp[src][k]=min;
    }
}
