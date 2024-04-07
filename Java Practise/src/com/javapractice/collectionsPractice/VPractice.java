package com.javapractice.collectionsPractice;
import java.util.*;

//vector
public class VPractice {

    public static void main(String[] args){
        Vector v1=new Vector();
        v1.add("Yadhagiri");
        v1.add("Yashodha");
        v1.add(0, "Krishna");
        Vector v2=new Vector();
        v2.add("Ramesh");
        v2.add("Suresh");
        v2.add(1, "varun");
        for(int i=0;i<v2.size();i++)
        {
            v1.add(i,v2.get(i));
        }

        v1.addAll(v2);
        System.out.println("capacity of vector: "+v1.capacity());
        System.out.println("Size of vector: "+v1.size());
        System.out.println("elements of vector: "+v1);
        System.out.println("6thelement of vector: "+v1.get(6));
        v1.remove(6);
        System.out.println("6thelement of vector: "+v1.get(6));
        v1.remove("varun");
        System.out.println("6thelement of vector: "+v1.get(6));
        v1.remove(v2);
        System.out.println("elements of vector: "+v1);
        v1.clear();
        v1.add("Sameer");
        System.out.println("elements of vector: "+v1);
        if(v1.contains("Sameer"))
        {
            System.out.println("Sameer found");
        }
        else{
            System.out.println("Sameer1 not fund"+v1);
        }

        Vector v3=new Vector();

        v3.add("Suresh");
        v3.add("Ramesh");
        v3.add(0, "varun");

        System.out.println("elements of vector v2: "+v2);
        System.out.println("elements of vector v3: "+v3);

        if(v2.containsAll(v3))
        {
            System.out.println("Both Collections have same elements");
        }
        else{
            System.out.println("Both Collections not have same elements");
        }

        v1.setElementAt("Swarupa",0);
        System.out.println("elements of vector v1: "+v1);

        System.out.println("index of element: "+v2.indexOf("Suresh"));
        System.out.println("last index of element: "+v2.lastIndexOf("Suresh"));
        System.out.println("First element for v2 list "+v2.firstElement());
        System.out.println("Last element for v2 list "+v2.lastElement());

        Object[] arr=v3.toArray();
        System.out.println("elements from array "+ Arrays.toString(arr));



        Vector v4=new Vector(200);
        v4.add("Sachin");
        v4.add("Ganguly");
        v4.add(0, "Sehwag");
        System.out.println("capacity of vector: "+v4.capacity());
        System.out.println("Size of vector: "+v4.size());

        Object[] arr1=new Object[] {1,5,7,9,3};
        Vector<Integer> v5=new Vector<>();
        //v5.add("Sadagopan");
        v5.add(12);
        //v5.add(200.67);
        v5.add(null);
        int sum=0;
        for (int i=0;i<arr1.length;i++)
        {

        }

    }
}
