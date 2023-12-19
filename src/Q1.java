import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Q1 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        removeRandomEntries(array);
    }

    public static void removeRandomEntries(Object[] array) {
        ArrayList<Object> list = new ArrayList<>(Arrays.asList(array));
        Collections.shuffle(list);

        while (!list.isEmpty()) {
            Object removed = list.remove(list.size() - 1);
            System.out.println("Removed: " + removed);
        }
    }

}
