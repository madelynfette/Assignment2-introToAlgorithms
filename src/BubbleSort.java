
public class BubbleSort implements SortingAlgorithm{

    public BubbleSort() {

    }
    public int[] sorty(int[] input) {
        //iterates through every element in the array
        for(int i = 0; i < input.length - 1; ++i) {
            //iterates over unsorted portion
            for(int j = 0; j < input.length - 1 - i; ++j) {
                //if element at next pos is smaller than current, swaps elements
                if (input[j + 1] < input[j]) {
                    int tmp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }
            }
        }
        //sorted array is returned
        return input;
    }

}



