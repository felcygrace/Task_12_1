package Task_12;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        // adding element to the treemap
        treeMap.put(101, "Maya");
        treeMap.put(102, "Priya");
        treeMap.put(103, "Kaviya");
        treeMap.put(104, "Preetha");
        treeMap.put(105, "Divya");
        treeMap.put(106, "Suganthi");
        treeMap.put(107, "Indhu");
        treeMap.put(108, "Dharani");
        treeMap.put(109, "Jenifer");
        treeMap.put(110, "Felcy");
        
        // Sorting TreeMap by values in alphabetical order
        Map<Integer, String> sortedValue = new TreeMap<>(new ValueComparator(treeMap));
        sortedValue.putAll(treeMap);
        
        // Iterate over the TreeMap after sorting by values
        System.out.println("Sorted Values in alphabetical order:");
        for (Integer key : sortedValue.keySet()) {
            System.out.println(key + " " + sortedValue.get(key));
        }
    }
    
    static class ValueComparator implements Comparator<Integer> {
        Map<Integer, String> map;
        
        public ValueComparator(Map<Integer, String> map) {
            this.map = map;
        }
        
        @Override
        public int compare(Integer key1, Integer key2) {
            String value1 = map.get(key1);
            String value2 = map.get(key2);
            return value1.compareTo(value2);
        }
    }
}
