class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numberSet = new HashSet();
        for(int counter=0;counter<nums.length;counter++){
            if(numberSet.contains(nums[counter])){
                return true;
            }
            numberSet.add(nums[counter]);
        }
        return false;
    }
}