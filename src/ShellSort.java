public class ShellSort implements SortingAlgorithm{
    public ShellSort() {
    }

    public int[] sorty(int[] input) {
        int n = input.length;

        //creates gap
        for(int gap = n / 2; gap > 0; gap /= 2) {
            //iterates through array
            for(int i = gap; i < n; ++i) {
                //element to be inserted
                int tmp = input[i];

                //insertion sort within gap
                for(int j = i; j >= gap && tmp < input[j - gap]; j -= gap) {
                    //make space for current element
                    input[j] = input[j - gap];
                    //insert element
                    input[j] = tmp;
                }
            }
        }
        //return sorted array
        return input;
    }

}
