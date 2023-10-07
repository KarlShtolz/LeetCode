package org.example.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 40. Combination Sum II
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in
 * candidates where the candidate numbers sum to target.
 * Each number in candidates may only be used once in the combination.
 * Note: The solution set must not contain duplicate combinations.
 *
 * Example 1:
 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * Output:
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 *
 * Example 2:
 * Input: candidates = [2,5,2,1,2], target = 5
 * Output:
 * [
 * [1,2,2],
 * [5]
 * ]
 */
public class CombinationSumII {
    List<List<Integer>> list=new ArrayList<List<Integer>>();
    void go(List ll,int count,int[] map,int[] ar,int target,int pos){
        for(int i=pos;i<count;i++){
            if(map[ar[i]]>0 && (target-ar[i])>=0){
                map[ar[i]]--;
                List<Integer> newlist=new ArrayList<Integer>(ll);
                newlist.add(ar[i]);
                if((target-ar[i])==0)
                    list.add(newlist);
                else go(newlist,count,map,ar,target-ar[i],i);
                map[ar[i]]++;
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int map[]=new int[51],n=candidates.length,count=0,ar[]=new int[51],i,j;
        for(i=0;i<n;i++){
            if(map[candidates[i]]==0)
                ar[count++]=candidates[i];
            map[candidates[i]]++;
        }
        go(new ArrayList<Integer>(),count,map,ar,target,0);
        return list;
    }
}
