class Solution {
     static int n,m;
    public static boolean dfs(char[][] board,String word,int r,int c,int idx){
        if(idx==word.length()) return true;
        if(r<0||r>=n||c<0||c>=m ||
            board[r][c]!=word.charAt(idx))
            return false;
            
           char temp=board[r][c]; 
           board[r][c]='#';
       boolean found= 
        dfs(board,word,r+1,c,idx+1)||
        dfs(board,word,r-1,c,idx+1)||
        dfs(board,word,r,c+1,idx+1)||
        dfs(board,word,r,c-1,idx+1);
        board[r][c]=temp;
        return found;

    }
    public boolean exist(char[][] board, String word) {
        n=board.length;
        m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(dfs(board,word,i,j,0))
                    return true;
                }
            }
        return false;
    }
}