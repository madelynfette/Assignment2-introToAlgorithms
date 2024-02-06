
public class InsertionSort implements SortingAlgorithm{

    public InsertionSort() {
    }
    public int[] sorty(int[] input) {
        //starts at second element
        for(int i = 1; i < input.length; ++i) {
            //store element to be inserted into sorted section
            int tmp = input[i];

            //iterates until finds position for current element
            int j;
            for(j = i; j > 0 && tmp < input[j - 1]; --j) {
                //shifts to the right to make room for element
                input[j] = input[j - 1];
            }
            //places current element into sorted position
            input[j] = tmp;
        }
        //returns sorted array
        return input;
    }

}
