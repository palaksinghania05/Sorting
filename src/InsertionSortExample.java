import java.util.Scanner;

public class InsertionSortExample {
    public static void main(String[] args) {
        InsertionSortExample obj = new InsertionSortExample();
        obj.func();
    }

    void func() {
        //step 1 input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int arr[] = new int[scanner.nextInt()];
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        //step 2 process
        for(int r = 0; r< arr.length; r++){
            for(int c = 0; c < r+1; c++){
                if(arr[c]>arr[r]){
                    int temp = arr[c];
                    arr[c] = arr[r];
                    arr[r] = temp;
                }
            }
        }

        //step 3 output
        System.out.println("-------Insertion Sort Output--------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
