import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Tester {
    SortingAlgorithm sa;

    //constructor for the Tester class that takes as parameter the sorting algorithm to be tested
    public Tester(SortingAlgorithm sa) {
        this.sa = sa;
    }

    public int[] randomArr(int size) {
        Random random = new Random();
        int[] randomArr = new int[size];

        for (int i = 0; i < size; ++i) {
            randomArr[i] = random.nextInt();
        }

        return randomArr;
    }

    public int[] generateKSorted(int[] my_array) {
        int min = 0;
        int max = 10;
        int m = 0;

        for(int i = 0; i < my_array.length / 10; ++i) {
            for(int j = 0; j < 10; ++j) {
                my_array[m] = (int)Math.floor(Math.random() * (double)(max - min + 1) + (double)min);
                ++m;
            }

            max += 11;
            min += 11;
        }

        return my_array;
    }




    //creates an array of integers of the given size, fills with random numbers and runs sorty
    double singleTest(int size) {
        //int[] arr = randomArr(size);
        int[] my_array = new int [size]; //for k sorted
        my_array = generateKSorted(my_array);
        long startTime = System.nanoTime();
        //sa.sorty(arr);
        sa.sorty(my_array); //for k sorted
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1e6; // Convert to milliseconds
    }

    //runs singleTest method as many times as the number of iterations provided and print avg time
    String test(int iterations, int size) {
        double totalTime = 0;
        for (int i = 0; i < iterations; i++) {
            totalTime += singleTest(size);
        }

        double averageTime = totalTime / iterations;
        String prin = String.format("Sorted %d elements in %.2f ms (avg)\n", size, averageTime);
        System.out.print(prin);
        return prin;
    }
}


