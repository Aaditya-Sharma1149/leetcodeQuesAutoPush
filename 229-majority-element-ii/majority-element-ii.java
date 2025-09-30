class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0;
        int count2=0;
        int candidate1=-1;
        int candidate2=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==candidate1 && count1>0){
                count1++;
                continue;
            }
            if(nums[i]==candidate2 && count2>0){
                count2++;
                continue;
            }
            if(count1==0){
                candidate1 = nums[i];
                count1=1;
                continue;
            }
            if(count2==0){
                if(nums[i]==candidate1){
                    continue;
                    }
                candidate2 = nums[i];
                count2=1;
                continue;
            }
            if(nums[i]!=candidate1 && nums[i]!=candidate2){
                count1--;
                count2--;
                continue;
            }
        }

        count1=0;
        count2=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==candidate1){
                count1++;
            }
            else if(nums[i]==candidate2){
                count2++;
            }
        }

        List <Integer> list = new ArrayList<>();
        if(count1>nums.length/3) list.add(candidate1);
        if(count2>nums.length/3) list.add(candidate2);
        return list;
    }
}