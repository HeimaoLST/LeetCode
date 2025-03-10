package dev.heimao.problem;

import java.util.HashMap;
import java.util.Map;

public class LeetCode506 {
    class Solution {
        public int subarraySum(int[] nums, int k) {

            Map<Integer,Integer> prefixSum = new HashMap<>();
            int  count  = 0;
            int sum=0;
            prefixSum.put(0,1);

            for(int num:nums){

                sum+=num;

                if(prefixSum.containsKey(sum-k)){
                    count+= prefixSum.get(sum-k);
                }

                prefixSum.put(sum,prefixSum.getOrDefault(sum,0)+1);




            }

            return count;

        }
    }
}
