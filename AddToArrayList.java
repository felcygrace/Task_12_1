package Task_12;

import java.util.ArrayList;

public class AddToArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> arraylist = new ArrayList<>();
        // adding to the array list
        arraylist.add(0,"Apple");
        arraylist.add(1, "orange");
        arraylist.add(2,"mango");
        arraylist.add(3,"Grapes");
        arraylist.add(4, "Pineapple");
        arraylist.add(5,"Banana");
        for (String iterable_element : arraylist) {
            System.out.println(iterable_element);  
        
        }
        //removing all the elements 
        arraylist.clear();
        System.out.println(arraylist.size());
        
    }




    
}
