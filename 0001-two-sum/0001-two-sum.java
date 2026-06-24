class Solution {
    public int[] twoSum(int[] nums, int target) {
            
            Map<Integer,Integer> ComplementMap =  new HashMap<>();

            for(int i=0; i<nums.length; i++){

                Integer ComplementIndex = ComplementMap.get(nums[i]);
                
                if(ComplementIndex != null){
                    return new int[] {ComplementIndex, i}; 
                }
                ComplementMap.put(target - nums[i], i);
            }
            return new int[0];
        }
    }