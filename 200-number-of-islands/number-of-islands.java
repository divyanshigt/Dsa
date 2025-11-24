class Solution {
    public static void dfs(char[][]grid,int r,int c){
        int rows=grid.length;
        int col=grid[0].length;
        if(r>=rows||r<0||c>=col||c<0) return;
        if(grid[r][c]!='1') return ;
        grid[r][c]='0';
            dfs(grid,r+1,c);
            dfs(grid,r-1,c);
            dfs(grid,r,c+1);
            dfs(grid,r,c-1);
        }
    
    public int numIslands(char[][] grid) {
        int r=grid.length,c=grid[0].length,island=0;
        
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(grid[i][j]=='1')
            island++;
            dfs(grid,i,j);
        }
    }
        return island;
    }
}