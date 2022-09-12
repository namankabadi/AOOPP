import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class AssignmentQuestion_5 {
        private static int arr[];

        public static void main(String[] args) throws FileNotFoundException, InterruptedException, IOException {
            File inputfile = new File("src/AssignmentQuestion5/Integers.txt");
            inputfile.createNewFile();
            File outputfile = new File("src/AssignmentQuestion5/SortedIntegers.txt");
            inputfile.createNewFile();
            FileWriter fwrite = new FileWriter(outputfile);

            Scanner in = new Scanner(inputfile);
            int size = in.nextInt();

            arr = new int[size];
            int i = 0;
            while (in.hasNext()) {
                arr[i++] = in.nextInt();
            }
            in.close();

            Thread T1 = new Thread() {
                public void run() {
                    ThreadSorting(arr, 0, (size / 3) - 1);
                }
            };

            Thread T2 = new Thread() {
                public void run() {
                    ThreadSorting(arr, (size / 3), ((size / 3) * 2) - 1);
                }
            };

            Thread T3 = new Thread() {
                public void run() {
                    ThreadSorting(arr, ((size / 3) * 2), (size - 1));
                }
            };

            Thread T4 = new Thread() {
                public void run() {
                    ThreadSorting(arr, 0, size - 1);
                }
            };

            T1.start();
            T1.join();
            T2.start();
            T2.join();
            T3.start();
            T3.join();
            T4.start();
            T4.join();

            for (int num : arr) {
                fwrite.append(String.valueOf(num) + " ");
            }
            fwrite.close();
        }

        public static void ThreadSorting(int arr[], int start, int end) {
            int tempArr[] = new int[end - start + 1];
            int tempIndex = 0;
            for (int i = start; i <= end; i++) {
                tempArr[tempIndex++] = arr[i];
            }
            Arrays.sort(tempArr);
            int index = start;
            for (int n : tempArr) {
                arr[index++] = n;
            }
        }
}

