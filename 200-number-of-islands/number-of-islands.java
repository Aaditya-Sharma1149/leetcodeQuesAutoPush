class Solution {
    public int numIslands(char[][] grid) {
        int i;
        int j;
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        int [] pop;
        Stack <int[]> st = new Stack<>();
        for(int I=0; I<grid.length; I++){
            for(int J=0; J<grid[0].length; J++){
                if(grid[I][J]=='1'){
                    st.add(new int[]{I,J});
                    while(!st.isEmpty()){

                        pop = st.pop();
                        i=pop[0];
                        j=pop[1];

                        if( i+1<n && grid[i+1][j]=='1'){
                            st.add(new int[]{i+1,j});
                            grid[i+1][j]='0';
                        }
                        if( j+1<m && grid[i][j+1]=='1'){
                            st.add(new int[]{i,j+1});
                            grid[i][j+1]='0';
                        }
                        if( i>=1 && grid[i-1][j]=='1'){
                            st.add(new int[]{i-1,j});
                            grid[i-1][j]='0';
                        }
                        if( j>=1 && grid[i][j-1]=='1'){
                            st.add(new int[]{i,j-1});
                            grid[i][j-1]='0';
                        }
                    }
                    grid[I][J]='0';
                    ans++;
                }
            }
        }
        return ans;
    }
}