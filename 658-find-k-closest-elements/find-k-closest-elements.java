class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int [] pair = new int[2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[0]!=b[0]){
                return Integer.compare(b[0],a[0]);
            }
            return Integer.compare(b[1],a[1]);
        });

        for(int i=0; i<arr.length; i++){
            pq.add( new  int [] {Math.abs(arr[i]-x) ,arr[i]} );
            while(pq.size()>k){
                pq.poll();
            }
        }
            List<Integer> list = new ArrayList<>();

            while (!pq.isEmpty()) {
            list.add(pq.poll()[1]);
            }

            Collections.sort(list);

            return list;
        
    }
}