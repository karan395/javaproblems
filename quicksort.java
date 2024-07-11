public class quicksort {
    public static void main(String[] args) {
        int arr[] = { 4, 7, 3, 1, 2, 6, 9, 8 };
        int n = arr.length;

        quicksort(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[], int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);
            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }

    }

    public static int partition(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                ///// SWAP

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        /// SWAP with pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i; ///////// PIVOT INDEX

    }
}
