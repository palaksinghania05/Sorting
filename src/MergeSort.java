import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        MergeSort object = new MergeSort();
        object.func();
    }
}


class MergeSort {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    void func() {
        //input
        System.out.println("Enter number of elements : ");
        int arr[] = new int[scanner.nextInt()];
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        //process
        List<Integer> finalArr = new ArrayList<>(divide(arr));
        //System.out.println(divide(arr));

        //output
        System.out.println("-------Merge Sort Output--------");
        for (int i = 0; i < finalArr.size(); i++) {
            System.out.println(finalArr.get(i));
        }
    }

    List<Integer> divide(int[] arr) {
        if(arr.length>2){
            int middle = arr.length / 2;
            int arr1[] = new int[middle];
            for (int i = 0; i < arr1.length; i++) {
                arr1[i]= arr[i];
            }
            //System.out.println(Arrays.toString(arr1));
            int arr2[] = new int[arr.length-middle];
            for (int j = 0; j < arr2.length; j++,middle++) {
                arr2[j]= arr[middle];
            }
            //System.out.println(Arrays.toString(arr2));
            if(arr1.length > 2)
                divide(arr1);
            else
                list = merge(list,arr1);
            if(arr2.length > 2)
                divide(arr2);
            else
                list = merge(list,arr2);
        }
        else
            list = merge(list,arr);
        return list;
    }

    List<Integer> merge(List<Integer> result, int[] arr) {
        if(arr.length == 2){
            if (arr[0] > arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
            
            for (int element: arr) {
                result.add(element);
            }
            return result;
        }
        else
            result.add(arr[0]);
        return result;
    }
}



/*class MergeSort{
    Scanner scanner = new Scanner(System.in);
    void func() {
        //input
        System.out.println("Enter number of elements : ");
        int arr[] = new int[scanner.nextInt()];
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        ArrayList<Integer> finalArr = mergeSort(arr);
        //output
        System.out.println("-------Merge Sort Output--------");
        for (int i = 0; i < finalArr.size(); i++) {
            System.out.println(finalArr.get(i));
        }
    }

    ArrayList<Integer> mergeSort(int[] array){
        if(array.length == 1) {
            ArrayList<Integer> c = new ArrayList<>();
            c.add(array[0]);
            return c;
        }
        int mid = array.length / 2;
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            arr1.add(array[i]);
        }
        System.out.println(arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int j = mid; j <= array.length - mid +1; j++) {
            arr2.add(array[j]);
        }
        System.out.println(arr2);
        return merge(arr1,arr2);
    }
    ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<>();
        while(a.size() !=0 && b.size() !=0){
            if(a.get(0)>b.get(0)){
                c.add(b.get(0));
                b.remove(0);
            }
            else{
                c.add(a.get(0));
                a.remove(0);
            }
        }
        while(a.size()!=0){
            c.add(a.get(0));
            a.remove(0);
        }
        while(b.size()!=0){
            c.add(b.get(0));
            b.remove(0);
        }
        return c;
    }
}*/
