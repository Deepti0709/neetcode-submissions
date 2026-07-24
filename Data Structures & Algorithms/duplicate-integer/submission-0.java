class Solution {
    public boolean hasDuplicate(int[] nums) {
     Map<Integer,Integer> frequency=new HashMap<>();
     for(Integer i: nums){
        frequency.put(i, frequency.getOrDefault(i, 0) + 1);
     }
     for(Integer val:frequency.values()){
        if(val>1){
            return true;
        }
     }
     return false;
    }
}