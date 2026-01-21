import java.util.ArrayList;
import java.util.List;

public class insertion_sort {
    public static void main(String[] args) {
        Integer[] array = { 5, 2, 4, 6, 1, 3 };

        int key = 0;
        int i = 0;

        for (int j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;

            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
            }

            array[i + 1] = key;
        }

        String result = new String();

        for (Integer element : array) {
            result += element + " ";
        }

        System.out.println(result);
    }

}
