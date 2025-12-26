package DSA_JAVA.BACKTRACKING;
public class pathtrackingDiagonal {
    public static void main(String[] args) {
        path("",3,3);
    }
    public static void path(String p,int r,int c){
  if(r==1 && c==1){
    System.out.println("Paths are:"+p);
    return;
  }
          if(r>1 && c>1){
            path(p+"D", r-1, c-1);
        }
        if(r>1){
         path(p+"V",r-1,c);
        }

        if(c>1){
            path(p+"H",r,c-1);
        }
    }
    
}
