package akr.infotech.extra;

import java.util.ArrayList;

public class SequencedCollectionDemo {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(22);
        nums.add(11);
        nums.add(32);
        nums.add(12);
        nums.add(16);
        System.out.println("Nums : "+nums);

        nums.addFirst(55);
        nums.addLast(44);
        System.out.println("nums : "+nums);
    }
}
