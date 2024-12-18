package main.java;

import java.util.Arrays;
import java.util.List;

public class Addition {
    public int add(String numbers) throws NumberFormatException {
//        Identify all delimiters and replace them by comma.
//        System.out.println(numbers + "  Initial inputs");
        String clean = numbers.replaceAll("[;\\n,/']*", ",");
        int[] arr = Arrays.stream(clean.split(","))
                .map(s -> s.replace(" ", ""))
                .filter(s -> !s.isBlank())
                .mapToInt(Integer::parseInt)
                .toArray();
//        System.out.println(arr.length + "with - strings");
        int sum = 0;

//        calculate sum of array of integers.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                throw new NumberFormatException();
            } else {
                sum += arr[i];
            }
        }
// return calculated sum.
        return sum;
    }
    public static void main(String[] args) {
//        System.out.println("Welcome to TDD addition program!");
    }
}