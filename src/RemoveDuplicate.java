import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    /**
     * Returns the array of unique strings in the same order provided.
     * Under the hood implementation is HashMap. It hash the value and calculate index accordingly and put values on that index.
     * On collision while adding values on index, it will be stored as a linked list on that index, if hash is same value will be replaced.
     *
     * @param arrayList
     * @return
     */
    public ArrayList<String> removeDuplicateFromArrayList(ArrayList<String> arrayList) {
        ArrayList<String> emailList = new ArrayList<>(arrayList);
        LinkedHashSet<String> set = new LinkedHashSet<>();
        emailList.forEach(email -> set.add(email));
        return (new ArrayList<>(set));
    }
}
