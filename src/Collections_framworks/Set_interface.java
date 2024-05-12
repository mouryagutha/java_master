package Collections_framworks;

import java.util.*;

public class Set_interface {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
         set.add("1one");
        set.add("2two");
        set.add("3three");
        set.add("4four");
        set.add("5five");
        set.add("6six");

        //duplicate

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);

        Iterator<String> i  = set.iterator();
        while(i.hasNext())
        {

            System.out.println(i.next());



        }

    }
}
