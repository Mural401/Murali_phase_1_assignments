package program.jav.collection;

import java.util.LinkedHashMap;
import java.util.Map;
public class Linkedlist1 {
	
  public static void main(String[] args) {
        
	    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        
        linkedHashMap.put(1, new String("apple"));
        linkedHashMap.put(2, new String("plum"));
        linkedHashMap.put(3, new String("kiwi"));
        linkedHashMap.put(4, new String("grapes"));
        linkedHashMap.put(5, new String("watermelon"));
        linkedHashMap.put(6, new String("mango"));
        linkedHashMap.put(7, new String("pineapple"));
        linkedHashMap.put(8, new String("cherry"));
        linkedHashMap.put(9, new String("orange"));
        linkedHashMap.put(10, new String("banana"));
        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
        System.out.println("\nValues of map after iterating over it : ");
        
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
        }
        
       
        System.out.println("\nLinkedHashMap contains 4 as key : " + linkedHashMap.containsKey(4));
        System.out.println("LinkedHashMap contains apple as value? : " + linkedHashMap.containsValue("apple"));
        System.out.println("LinkedHashMap contains banana as value? : " + linkedHashMap.containsValue("banana"));
        System.out.println("\nRemove entry for key 4 : " + linkedHashMap.remove(4));
        System.out.println("Content of LinkedHashMap after removing key 4: " + linkedHashMap);
        System.out.println("\nRemove entry for key 7 : " + linkedHashMap.remove(7));
        System.out.println("Content of LinkedHashMap after removing key 7: " + linkedHashMap);
        System.out.println("hashcode"+ linkedHashMap.hashCode());
        linkedHashMap.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
    }
}