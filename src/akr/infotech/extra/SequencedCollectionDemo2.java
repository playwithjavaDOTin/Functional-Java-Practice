package akr.infotech.extra;

import java.util.ArrayList;

public class SequencedCollectionDemo2 {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(22);
        nums.add(11);
        nums.add(32);
        nums.add(12);
        nums.add(16);
        System.out.println("Nums : "+nums);
        System.out.println("Reversed Order : "+nums.reversed());
    }
}
