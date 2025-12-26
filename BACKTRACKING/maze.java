package DSA_JAVA.BACKTRACKING;

public class maze {
    public static void main(String[] args) {
        System.out.println(d(3,3));
    }
    public static int  d(int r,int c) {
        if(r ==1 || c==1){
            return 1;
        }
    int left = d(r-1, c);
    int right = d(r, c-1);
    return left + right;
    }
}
