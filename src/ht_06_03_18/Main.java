package ht_06_03_18;
import java.util.*;


public class Main{
    public static void main (String[] args)
    {
        List<Integer>list = new LinkedList<>();
        System.out.println(System.currentTimeMillis());
        for (int i=0; i <=10000;i++)
        {
            list.add(i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("z");
        List<Integer> p = new ArrayList<>();
        System.out.println(System.currentTimeMillis());
        for (int i=0; i <=10000;i++)
        {p.add(i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("z");
        TreeSet<Integer> p1 = new TreeSet<Integer>();
        System.out.println(System.currentTimeMillis());
        for (int i=0; i <=10000;i++)
        {
            p1.add(i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("z");
        HashSet<Integer> p2 = new HashSet<>();
        System.out.println(System.currentTimeMillis());
        for (int i=0; i <=10000;i++)
        {
            p2.add(i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("z");
        System.out.println(System.currentTimeMillis());
        for (int i=0; i <=10000;i++)
        {
            list.contains(i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("z");
        System.out.println(System.currentTimeMillis());
        for (int i=0; i <=10000;i++)
        {
            p.contains(i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("z");
        System.out.println(System.currentTimeMillis());
        for (int i=0; i <=10000;i++)
        {
            p1.contains(i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("z");
        System.out.println(System.currentTimeMillis());
        for (int i=0; i <=10000;i++)
        {
            p2.contains(i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("z");
        System.out.println(System.currentTimeMillis());
        for (int i=0; i <=10000;i++)
        {
            list.remove(Integer.valueOf(i));
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("z");
        System.out.println(System.currentTimeMillis());
        for (int i=0; i <=10000;i++)
        {
            p.remove(Integer.valueOf(i));
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("z");
        System.out.println(System.currentTimeMillis());
        for (int i=0; i <=10000;i++)
        {
            p1.remove(i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("z");
        System.out.println(System.currentTimeMillis());
        for (int i=0; i <=10000;i++)
        {
            p2.remove(i);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println("z");
    }
}