import java.util.*;

public class ArrayListtut{
    public static void main(String[] args) {
        
    ArrayList <Integer> ls = new ArrayList<>();
    ls.add(3);
    ls.add(4);

    ArrayList <Integer> ls2 = new ArrayList<>();

    ls2.add(0,1);
    ls2.add(1,2);

    // ls.addAll(ls2) - Just appends to list of l1 { 10,20,30,40}

    ls.addAll(0,ls2); //Inserts at specified index 30,40,10,20

    //ls.clear();

    ArrayList<Integer> ls3 = (ArrayList<Integer>)ls.clone();  // Creates a copy = clone
    //ls3.remove(1);
   
    ArrayList <Integer> ls4 = new ArrayList<>();
    ls4.add(99);
    ls4.add(2);
    ls4.add(100);
    ls4.add(30);

    Collections.sort(ls4);
   
    List<Integer> ls5 = ls4.subList(1, 3); 
    System.out.println(ls5);

    //ls.removeAll(ls4); // removes all the ls4 elemets from ls
    //ls.removeIf(n ->(n % 2 ==0));




    /*Iterator <Integer> it =  ls3.iterator();
    while (it.hasNext()) {                        // --->> Iteratres over elememts in list

        System.out.print(it.next()+",");   
    };
    
    /*ListIterator <Integer> it2 = ls.listIterator(2);
    while (it2.hasNext()) {         //--->> Iterates over list with specified Index;

        System.out.println(it2.next()+",");  
    };*/




    //System.out.println(ls3.contains(10));
    //System.out.println(ls3.indexOf(10));
    //System.out.println(ls3.lastIndexOf(10));

    //ArrayList <Integer> ls4 = new ArrayList<>();
    //System.out.println(ls4.isEmpty()); -- Returns if the list is empty;



    



for( int i=0 ; i<ls4.size();i++){
    System.out.print(ls4.get(i));
    System.out.print(",");
}
    }
}