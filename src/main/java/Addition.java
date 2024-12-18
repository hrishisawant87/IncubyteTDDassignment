package main.java;

import java.util.Arrays;

public class Addition {
    public int add(String numbers) throws NumberFormatException {
//        Identify all delimiters and replace them by comma.
        String clean = numbers.replaceAll("\\D+", ",");
//        split comma separated string and convert to integer array.
        int[] arr = Arrays.stream(clean.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
//        calculate sum of array of integers.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                throw new NumberFormatException("negative numbers not allowed <negative_number>");
            } else {
                sum += arr[i];
            }

        }
// return calculated sum.
        return sum;
    }

    public static void main(String[] args) {
        int result = 0;
        String number = "1//2;3\n 4,5";
//        result = add(number);
        System.out.println("Display result in main" + result);
    }
}