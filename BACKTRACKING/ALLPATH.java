package DSA_JAVA.BACKTRACKING;

public class ALLPATH {
    public static void main(String[] args) {
        boolean board[][]={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        path("",board,0,0);
    }
    public static void path(String p, boolean[][] board, int r, int c){
  if(r==board.length-1 && c==board[0].length-1){
    System.out.println("Paths are:"+p);
    return;
  }
          if(!board[r][c]){
            return;}

          board[r][c]=false; //mark as visited false  
        if(r<board.length-1){
         path(p+"V",board,r+1,c);
        }

        if(c<board[0].length-1){
            path(p+"H",board,r,c+1);
        }
        if(r>0){
            path(p+"U",board,r-1,c);
        }
        if(c>0){
            path(p+"L",board,r,c-1);
    }
    // During returning time mark ture
    board[r][c]=true;

}}
