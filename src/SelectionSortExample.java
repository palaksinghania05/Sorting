import java.util.Scanner;

public class SelectionSortExample {

    public static void main(String[] args) {
        SelectionSortExample object = new SelectionSortExample();
        object.func();
    }

    void func() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int arr[] = new int[sc.nextInt()];

        //step1 input
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //step2 process
        for (int r = 0; r < arr.length-1; r++) {
            //no. of passes
            for (int c = r+1; c <= arr.length-1; c++) {
                // no. of comparisons in each pass
                if(arr[r]>arr[c]){
                    //condition for swapping
                    int temp = arr[r];
                    arr[r]=arr[c];
                    arr[c]=temp;
                }
            }
        }

        //step3 output
        System.out.println("----------Selection Sort Output----------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
