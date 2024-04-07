package com.javapractice.collectionsPractice;

import java.util.ArrayList;

public class ALPractice {

    public static void main(String[] args){
          ArrayList<Integer> al1=new ArrayList<>();
          System.out.println(al1);
        System.out.println("ArrayList Size before adding element "+al1.size());
        al1.add(200);
        al1.add(0,8);
        al1.add(1,201);
        al1.add(2,156);
        System.out.println(al1);
        System.out.println("ArrayList Size before adding element "+al1.size());
        System.out.println("ArrayList  element "+al1.get(2));
        //al1.remove(2);
        //al1.clear();
        System.out.println(al1.contains(156));
        al1.set(3,207);
        for(int i:al1){
            System.out.println(al1.indexOf(i));

        }
        for(int k:al1){
            System.out.println(k);

        }

        int sum=0;
        for (int j=0;j<al1.size();j++ )
        {
            System.out.println(al1.get(j));
            sum+=al1.get(j);
        }
        System.out.println("Sum of array list: "+sum);
    }
}
