package STACK;
import java.util.*;


public class sum {
    public static int countsum(int max,int[] a,int[] b){
        return helper(max,a,b,0,0)-1;
    }

    public static int helper(int max,int []a,int []b,int count,int sum){
        if(sum>max){
            return count;
        }

 if(a.length == 0 && b.length == 0){
            return count;
        }

        int ans1=helper(max,Array.copyOfRange(a,1,a.length),b,count+1,sum+a[0]);
        int ans2=helper(max,a,Array.copyOfRange(b,1,b.length),count+1,sum+b[0]);
        return Math.max(ans1,ans2);
    }


    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = {4,5,6};
        System.out.println(countsum(10,a,b));
    }
}
