import java.io.FileWriter;
import java.io.IOException;

public class Performance {
    public static void main(String[] args) {

        //Changed for k-sorted
        try (FileWriter fileWriter = new FileWriter("performanceReportKsorted.txt")) {

            int[] arraySizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};

            BubbleSort bubbleSort = new BubbleSort();
            InsertionSort insertionSort = new InsertionSort();
            QuickSort quickSort = new QuickSort();
            MergeSort mergeSort = new MergeSort();
            SelectionSort selectionSort = new SelectionSort();
            ShellSort shellSort = new ShellSort();

            Tester bubbleSortTester = new Tester(bubbleSort);
            Tester insertionSortTester = new Tester(insertionSort);
            Tester quickSortTester = new Tester(quickSort);
            Tester mergeSortTester = new Tester(mergeSort);
            Tester selectionSortTester = new Tester(selectionSort);
            Tester shellSortTester = new Tester(shellSort);

            int iterations = 20;


            for (int size : arraySizes) {
                fileWriter.write("Array Size: " + size + "\n");


                fileWriter.write("\tSorting algorithm - BubbleSort\n");
                System.out.println("Sorting algorithm - BubbleSort");
                fileWriter.write(bubbleSortTester.test(iterations, size));


                fileWriter.write("\tSorting algorithm - QuickSort\n");
                System.out.println("Sorting algorithm - QuickSort");
                fileWriter.write(quickSortTester.test(iterations, size));

                fileWriter.write("\tSorting algorithm - MergeSort\n");
                System.out.println("Sorting algorithm - MergeSort");
                fileWriter.write(mergeSortTester.test(iterations, size));

                fileWriter.write("\tSorting algorithm - InsertionSort\n");
                System.out.println("Sorting algorithm - InsertionSort");
                fileWriter.write(insertionSortTester.test(iterations, size));

                fileWriter.write("\tSorting algorithm - Selection Sort\n");
                System.out.println("Sorting algorithm - SelectionSort");
                fileWriter.write(selectionSortTester.test(iterations, size));

                fileWriter.write("\tSorting algorithm - Shell Sort\n");
                System.out.println("Sorting algorithm - ShellSort");
                fileWriter.write(shellSortTester.test(iterations, size));

                fileWriter.write("\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}










