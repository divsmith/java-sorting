/**
 * Created by parker on 4/8/18.
 */
public class SelectionSort {

    public static void sort(Comparable[] arr)
    {

    }

    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    private static void exchange(Comparable[] arr, int i, int j)
    {
        Comparable swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
}
