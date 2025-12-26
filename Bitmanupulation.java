package DSA_JAVA;
public class Bitmanupulation {
    public static void main(String[] args) {
        // GET BIT
        // int n=5;
        // int pos=2;
        // int Bitmask=1<<2;
        // if((Bitmask & n) == 0){
        //     System.out.println("Bit was zero");
        // }else{
        //     System.out.println("Bit was one");
        // }

        // SET BIT
        //  int n=5;
        //  int pos=1;
        //  int Bitmask=1<<pos;
        // int newNummber= Bitmask | n;
        // System.out.println("=="+newNummber);

        //Clear
         int n=5;
         int pos=2;
         int Bitmask=n<<2;
         int not=~Bitmask;
         int newnumber=n & not;
         System.out.println("=="+newnumber);
    }
} 
