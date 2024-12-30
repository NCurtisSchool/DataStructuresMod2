//Imports
import java.util.ArrayList;

public class Bag<T> {
    // Attributes
    private ArrayList<T> myItems;

    // Constructor
    public Bag() {
        myItems = new ArrayList<>();
    }

    // Methods
    public void add(T addedItem) {
        // Add item into bag
        myItems.add(addedItem);
    }

    public int size() {
        // return amount of items in bag
        int tempSize = myItems.size();
        return tempSize;
    }

    public void merge(Bag<T> otherBag) {
        ArrayList<T> tempMergeList = new ArrayList<>();
        tempMergeList.addAll(myItems);
        tempMergeList.addAll(otherBag.myItems);
        myItems.clear();
        myItems.addAll(tempMergeList);
    }

    public Bag<T> distinct() {
        Bag<T> distinctBag = new Bag<>();
        for (int i = 0; i < myItems.size(); i++) {
            if (distinctBag.myItems.contains(myItems.get(i)) == false) {
                distinctBag.add(myItems.get(i));
            }
        }
        return distinctBag;
    }

    public void outputString() {
        for (int i = 0; i < myItems.size(); i++) {
            System.out.println(myItems.get(i));
        }
    }
}
