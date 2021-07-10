import java.util.Arrays;

public class QuickSortExample {
    public static void main(String[] args) {
        // initialize an array integers
        int[] integers = {10,5,15,2,13};

        System.out.println("\n\nSort via Quick sort:");
        System.out.println("------------------------");

        System.out.println("\nSorting numbers ...");
        sort(integers, 0, integers.length - 1);
        System.out.println("Sorted: " + Arrays.toString(integers));
    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int m = partition(arr, left, right);

            sort(arr, left, m - 1);
            sort(arr, m + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {

        int pivot = arr[right];
        int m = left;
        for (int i = m; i < right; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, m++);
            }
        }
        swap(arr, right, m);
        return m;
    }
    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}
