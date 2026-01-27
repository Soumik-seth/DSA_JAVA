public class Happynumber202 {




        public boolean isHappy(int n) {
     int slow =n;
     int fast=n;
     do{
        slow=sum(slow);
        fast=sum(sum(fast));
        
    }while(slow != fast);
     if(slow ==1 ){
        return true ;
     }else{
        return false;
     }

    }


    public int sum(int n){
                 int sum =0;
while (n>0){
   
    int digit=n%10;
     sum += digit * digit;
     n=n/10;
}
return sum;

    }
}
