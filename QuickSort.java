import java.util.Scanner;
public class QuickSort {
    public static int steps=0;
  
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        
       

        while (i <= j) {
            steps++;
            while (i <= high && arr[i] < pivot) {
                steps++;
                i++;
            }
            while (j >= low + 1 && arr[j] > pivot) {
                steps++;
                j--;
            }
            if (i < j) {
                steps++;
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        swap(arr, low, j);
        return j;
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quicksort(arr, low, p - 1);
            quicksort(arr, p + 1, high);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       
        System.out.print("Enter how many elements you want to insert:");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.print("Enter the elements of the array:");

        int[] arr= new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The array before sorting: " );
        printArray(arr);
        quicksort(arr, 0, arr.length - 1);
        System.out.print("The array after quicksort: ");
        printArray(arr);
        System.out.println("The number of steps required is:" + steps);
        
        
    }
}