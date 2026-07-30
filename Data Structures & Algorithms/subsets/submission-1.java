class Solution {
    List<List<Integer>> list = new ArrayList<>();
    int[] nums;
    
    public List<List<Integer>> subsets(int[] nums) {
        this.nums=nums;
        List<Integer> current= new ArrayList<>();
        backtrack(0,current);
        return list;
    }
    public void backtrack(int idx,List<Integer> current){
        if(idx== nums.length){
            list.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[idx]);
        backtrack(idx+1,current);
        current.remove(current.size()-1);
        backtrack(idx+1,current);
    }
}
