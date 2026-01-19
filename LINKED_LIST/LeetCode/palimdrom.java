public class palimdrom {
    public static void main(String[] args) {
    //     String str="abcba";
    //     int r=str.length()-1;
    //     int l=0;
    //     boolean palimdrom=true;
    //     while (l<r) {
    //         if(str.charAt(l) !=str.charAt(r)){
    //           palimdrom=false;
    //         break;
    //         }
    //        l++;
    //     r--;
    //     }
    //    if(palimdrom){
    //     System.out.println("palimdrom");
    //    }else{
    //     System.out.println("not palimdrom");
    //    }

   int num=12320;
   int orginal=num;
   int reverse=0;
   while(num>0){
    int modulo=num%10;
     reverse=reverse *10+modulo;
  num=num/10;
   }
   if(orginal == reverse){
    System.out.println("palimdrom");
   }else{
    System.out.println("NOt palimdrom");
   }

    }
    
}
