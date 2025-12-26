package DSA_JAVA;
import java.util.*;
class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        int element = list.get(1);
        System.out.println(element);
        list.set(1, 25);
        System.out.println(list);
        int size = list.size();
        System.out.println(size);
        Collections.sort(list);
        System.out.println(list);

    }
}