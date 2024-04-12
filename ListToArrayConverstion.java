package Task_12;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayConverstion {
    public static void main(String[] args) {
        
    List<String> list = new ArrayList<>();
        // adding element to the list
        list.add("Apple");
        list.add("orange");
        list.add("mango");
        list.add("Grapes");
        list.add("Pineapple");
        list.add("Banana");
        // converting List to Array
        String[] array = list.toArray(new String[list.size()]);

        System.out.println("Listing the elements in the array");
        // printing values in array
        for (String element : array) {
            System.out.println(element);
            
        }
    
    
}
}
