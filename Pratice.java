import java.util.*;

// same as arraylist + offer+ peeek + poll  +addFirst/last + get First / get Last +
// descending iteraror + remove occurenec


public class Pratice {
    public static void main(String[] args) {
        
        LinkedList <Integer> l1 = new LinkedList<>();

        l1.add(2);
        l1.add(0,1);
        l1.add(34);
        l1.add(60);
        l1.add(3);
        l1.add(4);
        l1.offer(69);
        l1.offerFirst(14);
        l1.offerLast(100);

        System.out.println(l1);
       
        System.out.println(l1.pollLast());

        System.out.println(l1);
        

    
        
        

    }
}
