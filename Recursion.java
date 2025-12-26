package DSA_JAVA;
import java.util.*;

public class Recursion {
  public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
      "tu", "vwx", "yz" };

public static void printKeypadCombination(String number, int idx,String combString){

if(idx==number.length()){
  System.out.println(combString);
  return;
}
int currentchar=number.charAt(idx);
String mapping=keypad[currentchar-'0'];
for(int i=0;i<mapping.length();i++){
  printKeypadCombination(number, idx+1, combString+mapping.charAt(i));
}


   

  }



  public static void main(String[] args) {
   
String number = "23";
printKeypadCombination(number, 0, "");
  }
}
