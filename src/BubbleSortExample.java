import java.util.Scanner;

public class BubbleSortExample {
    void func() {
        //step1 input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //step2 process
        for (int r = 0; r < arr.length-1; r++) {
            for (int c = 0; c < arr.length-r-1; c++) {
                if(arr[c]>arr[c+1]){
                    int temp = arr[c];
                    arr[c] = arr[c+1];
                    arr[c+1] = temp;
                }
            }
        }

        //step3 output
        System.out.println("---------Bubble Sort Example--------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        BubbleSortExample obj = new BubbleSortExample();
        obj.func();
    }
}
