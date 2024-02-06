import java.util.Stack;

public class QuickSort implements SortingAlgorithm {

    public QuickSort() {
    }

    static int partition(int[] array, int low, int high) {

        //selects pivot
        int pivot = array[high];
        int i = low - 1;

        //rearranges around pivot
        for (int j = low; j < high; ++j) {
            if (array[j] <= pivot) {
                ++i;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //returns the index of pivot
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    static void quickSort(int[] array, int low, int high) {

        //would not let me not use this stack
        Stack<Integer> stack = new Stack<>();
        stack.push(low);
        stack.push(high);

        while (!stack.isEmpty()) {
            high = stack.pop();
            low = stack.pop();

            int part = partition(array, low, high);

            if (part - 1 > low) {
                stack.push(low);
                stack.push(part - 1);
            }

            if (part + 1 < high) {
                stack.push(part + 1);
                stack.push(high);
            }
        }
    }

    public int[] sorty(int[] input) {
        int size = input.length;

        try {
            quickSort(input, 0, size - 1);
        } catch (Exception var4) {
            System.out.println(var4);
        }

        return input;
    }
}


