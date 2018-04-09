/**
 * Created by parker on 4/8/18.
 */
public class Selection {

    public static void sort(Comparable[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int min = i;
            for (int j = i + 1; j < arr.length; j++)
            {
                if (less(arr[j], arr[min]))
                {
                    min = j;
                }
            }

            exchange(arr, i, min);
        }
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
