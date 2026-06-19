class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] positions = new int[2];
        HashMap<Integer, Integer> map = new HashMap();
        for(int counter=0;counter<nums.length;counter++){
            map.put(nums[counter],counter);
        }

        for(int counter=0;counter<nums.length;counter++){
            
            if(map.containsKey(target-nums[counter]) 
            && map.get(target-nums[counter])!=counter ){
                positions[0] = counter;
                positions[1] = map.get(target-nums[counter]);
                break;
            }
        }
        return positions;
    }
}
