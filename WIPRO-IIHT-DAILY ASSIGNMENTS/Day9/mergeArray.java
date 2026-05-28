package Day9;
import java.util.*;
public class mergeArray {
	public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        List<String> list2 = new ArrayList<>();
        list2.add("Banana"); 
        list2.add("Grape");
        list2.add("Apple"); 

        List<String> mergedList = new ArrayList<>(list1);

        for (String item : list2) {
            if (!mergedList.contains(item)) {
                mergedList.add(item);
            }
        }

        System.out.println("Merged Unique List: " + mergedList);
    }
}
