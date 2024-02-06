public class SelectionSort implements SortingAlgorithm{

    public SelectionSort(){

    }

    //method to swap elements
    void swap(int[] input, int i, int j) {
        int tmp = input[j];
        input[j] = input[i];
        input[i] = tmp;
    }

    public int[] sorty(int[] input) {
        //iterates over each element in array
        for(int i = 0; i < input.length; ++i) {
            int minIndex = i;

            //finds min index in unsorted section
            for(int j = i; j < input.length; ++j) {
                //if smaller, swaps them
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }

                this.swap(input, i, minIndex);
            }
        }
        //returns sorted array
        return input;
    }


}
