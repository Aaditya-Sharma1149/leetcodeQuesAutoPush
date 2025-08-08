class Solution {
    public int findCircleNum(int[][] isConnected) {
        int [] visited = new int[isConnected.length];
        int ans=0;
        for(int i=0; i<visited.length; i++){
            if(visited[i]==0){
                ans++;
                //bfs(isConnected, visited,i);
                dfs(isConnected,visited,i);
            }
        }
        return ans;
    }
    public void bfs(int [][] isConnected, int [] visited, int curr){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(curr);
        visited[curr]=1;
        while(!q.isEmpty()){
            int node = q.remove();
            for(int i=0; i<isConnected.length; i++){
                if(isConnected[node][i]==1 && i != node && visited[i]==0){
                    visited[i]=1;
                    q.add(i);
                }
            }
        }
    }
    public void dfs(int [][] isConnected, int [] visited, int curr){
        visited[curr]=1;
        for(int i=0; i<isConnected[curr].length; i++){
            if(isConnected[curr][i]==1 && i != curr && visited[i]==0){
                dfs(isConnected,visited,i);
            }
        } 
    }
}