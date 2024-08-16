class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int minIndex=-1;
        int maxIndex=-1;
        for(int i=0; i<arrays.size(); i++){
            if (arrays.get(i).get(0)<min){
                min2=min;
                min = arrays.get(i).get(0);
                minIndex = i;
            }else if(arrays.get(i).get(0)<min2){
                min2 = arrays.get(i).get(0);
            }
            if (arrays.get(i).get(arrays.get(i).size() - 1) > max){
                max2 = max;
                max = arrays.get(i).get(arrays.get(i).size() - 1);
                maxIndex = i;
            }else if(arrays.get(i).get(arrays.get(i).size() - 1) > max2){
                max2 = arrays.get(i).get(arrays.get(i).size() - 1);
            }
        }
        if( minIndex != maxIndex) return max - min;

        return Math.max(max - min2 , max2 - min);

    }
}