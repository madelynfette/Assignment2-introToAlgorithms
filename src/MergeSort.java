public class MergeSort implements SortingAlgorithm {
    MergeSort() {
    }

    static void merge(int[] array, int low, int part, int high) {
        int a1 = part - low + 1;
        int a2 = high - part;
        int[] A1 = new int[a1];

        for(int i = 0; i < a1; ++i) {
            A1[i] = array[low + i];
        }

        int[] A2 = new int[a2];

        int k;
        for(k = 0; k < a2; ++k) {
            A2[k] = array[part + 1 + k];
        }

        k = 0;
        int l = 0;

        int m;
        for(m = low; k < a1 && l < a2; ++m) {
            if (A1[k] <= A2[l]) {
                array[m] = A1[k];
                ++k;
            } else {
                array[m] = A2[l];
                ++l;
            }
        }

        while(k < a1) {
            array[m] = A1[k];
            ++k;
            ++m;
        }

        while(l < a2) {
            array[m] = A2[l];
            ++l;
            ++m;
        }

    }

    static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int part = (low + high) / 2;
            mergeSort(array, low, part);
            mergeSort(array, part + 1, high);
            merge(array, low, part, high);
        }

    }

    public int[] sorty(int[] input) {
        int size = input.length;
        mergeSort(input, 0, size - 1);
        return input;
    }
}
