import java.util.ArrayList;
/**
 * The SortedArrayList class is for sorting an array list of elements so that 
 * they are sorted into descending order.
 * 
 * @author Thomas Harwin
 * @version 1.0
 */

public class SortedArrayList<E extends Comparable<? super E>> extends ArrayList<E>
{
    /**
     * A generic method for inserting elements into an ArrayList in a sorted 
     * order
     * 
     * @param  ArrayList<E>   An Array List of type Element
     */

    public static <E extends Comparable<E>> void insertionSort(ArrayList<E> a)
    {
        ArrayList<E> list = new ArrayList<E>(a);
        // for(int i = 1 ; i < list.size(); i++){
            // E minSoFar =  list.get(i);
            // int j = i - 1;
            // while(j >= 0 && minSoFar.compareTo(list.get(j)) < 0){
                // list.set(j + 1, list.get(j));
                // j--;
            // }
            // list.set(j + 1, minSoFar);
        // }

        for (int i = 0; i < list.size() - 1; i++) {
            E minSoFar = list.get(i);
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(j).compareTo(minSoFar) < 0) {
                    minSoFar = list.get(j);
                    min = j;
                }
            }

            if (min != i) {
                list.set(min, list.get(i));
                list.set(i, minSoFar);
            }
        }
    }
}
