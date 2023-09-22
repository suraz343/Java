import java.util.Scanner;
public class MergeSort {

    public static void merge(int[] arr, int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        int[] Left = new int[n1];
        int[] Right = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            Left[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            Right[j] = arr[middle + 1 + j];

        // Merge the temporary arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;

        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = (left + right) / 2;

            // Sort first and second halves
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter how many elements you want to enter:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Enter the elements now:-");
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
      
        System.out.print("The elements before sorting are:-");
        for (int i = 0; i < num; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        mergeSort(arr, 0, num - 1);

        System.out.print("The elements after mergeSort are:-");
        for (int i = 0; i < num; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}