package program.jav.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class linkedlists {
    public static void main(String a[]){
    	
    	int a1=10;
    	
        LinkedList<String> ll = new LinkedList<String>();
        
        ll.add("May");
        ll.add("June");
        ll.add("July");
        ll.add("August");
        ll.add("November");
        ll.addLast("December"); 
        ll.addFirst("January");
        ll.add(1,"March");
        ll.add(1,"Febuary");
        ll.add(7,"September");
        ll.add(8,"October");
        ll.add(3,"April");
        
        System.out.println(ll);
        System.out.println("the even months are :  " +ll.get(0) + "  " + ll.get(2)+"  " + ll.get(4)+"  " + ll.get(6)+"  " + ll.get(8)+"  " + ll.get(10));
        
        System.out.println("the odd months are :  " +ll.get(1) + "  " + ll.get(3)+"  " + ll.get(5)+"  " + ll.get(7)+"  " + ll.get(9)+"  " + ll.get(11));
        

        System.out.println("the first and last month is: " +ll.getFirst() + " and " +ll.getLast());
        
        Iterator itr=ll.iterator();
        while(itr.hasNext()) {
        System.out.println("list is "+ itr.next());
        }
       
        System.out.println("After removing my birthday:" + ll.remove(11));
        System.out.println(ll);
        
        System.out.println("This linkedlist contains any winter month or not ? " +ll.contains("December"));
        
        
    }
}