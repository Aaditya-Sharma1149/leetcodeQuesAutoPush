class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List <List <Integer>> list = new ArrayList<List <Integer>>();
        for(int i=0; i<nums.length; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if(nums[i]>0) break;
            List <List<Integer>> ans = twoSum(nums,i);
            if(!ans.isEmpty()){
                list.addAll(twoSum(nums,i));
            }
        }
        if(list.isEmpty()){
            return new ArrayList<>();
        }
        return list;
    }
    private List<List<Integer>> twoSum(int[] nums,int idx){
        int target = -nums[idx];
        List<List<Integer>> list = new ArrayList<>();
        HashMap <Integer,Integer> map = new HashMap<>();
        Set <String> set= new HashSet<>();
        for(int i=idx+1; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int a = nums[idx];
                int b = nums[i];
                int c =target-nums[i];
                int [] triplet = new int[]{a,b,c};
                Arrays.sort(triplet);
                if(!set.contains(triplet[0] + " , " + triplet[1] + " , " + triplet[2])){
                    set.add(triplet[0] + " , " + triplet[1] + " , " + triplet[2]);
                    list.add(Arrays.asList(triplet[0],triplet[1],triplet[2]));
                }
            }
            map.put(target-nums[i], i);
        }
        return list;
    } 
}