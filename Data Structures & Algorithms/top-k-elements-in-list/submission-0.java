class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[k];
        for(int num: nums){
        map.merge(num,1,Integer::sum);
        }
        List<Map.Entry<Integer,Integer>> freq=new ArrayList<>(map.entrySet());
        freq.sort((a,b)->b.getValue()-a.getValue());
        int i=0;
        while(k-->0){
            arr[i]=freq.get(i).getKey();
            i++;
        }
    return arr;
    }
}
