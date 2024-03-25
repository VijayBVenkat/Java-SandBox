package org.vijay.streams;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class learnStreams {

    public static void main(String[] args) {

        List <Integer> intList = Arrays.asList(10, 20, 11, 19, 12, 18, 13, 17, 14, 16, 15, 10, 11);

        // sorting a list
//        List<Integer> sortedList = intList.stream().sorted().toList();
        // sort the list in reverse order
        List<Integer> revSortedList = intList.stream().sorted(Comparator.reverseOrder()).toList();
//        printList(sortedList);

        // separate odd and even numbers
//        Map<Boolean, List<Integer>> mapOddEven =  intList.stream()
//                            .collect(Collectors.partitioningBy(num -> num%2==0));
//        printMap(mapOddEven);

        // remove duplicate from the list
//        List<Integer> distinctList =  intList.stream().distinct().toList();
//        printList(distinctList);

        // get count of the list - with and without duplicates
//        long count = intList.size();
//        System.out.println("Count with duplicates " + count);
//        count = intList.stream().distinct().count();
//        System.out.println("Count with duplicates " + count);

        // find max and min of the elements in the list
//        int max = intList.stream().max(Comparator.naturalOrder()).orElse(0);
//        int min = intList.stream().min(Comparator.naturalOrder()).orElse(0);
//        System.out.println("Max value: " + max + " Min Value: " + min);

        // merge and sort 2 unsortedArrays
//        mergeAndSortArrays();
        
        // frequency of each character in a string
//        freqOfCharInString();

        // print first 10 even numbers
//        print10EvenNumbers();

        // second largest element in an int array
//        secondLargestInArray();

        // three max and min numbers from the list
//        threeMaxAndMin();

        // sum of digits of a number
//        sumOfDigits();

        // reverse each word in an array
//        reverseStringsInArray();

        // sum and average of all elements in an array
        arraySumAndAvg();
    }

    private static void arraySumAndAvg() {
        int[] inputArray = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        int sumOfArray = Arrays.stream(inputArray).sum();

        double avgOfArray =
                Arrays.stream(inputArray).average().orElse(0.0);

        System.out.println("Sum: " + sumOfArray + " Average: " + avgOfArray);

    }

    private static void reverseStringsInArray() {

        String str = "Java Concept Of The Day";
        String newStr = Arrays.stream(str.split(" "))
                .map(w -> new StringBuffer(w).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(newStr);

        String newStr1 = String.valueOf(new StringBuffer(str).reverse());
        System.out.println(newStr1);

    }

    private static void sumOfDigits() {

        int inputVal = 99993;

        int sumVal = inputVal;

        while (sumVal > 9) {
            sumVal = Stream.of(String.valueOf(sumVal).split(""))
                    .mapToInt(Integer::parseInt).sum();
//                    .collect(Collectors.summingInt(Integer::parseInt));

            // both the above conditions yield the same result
            // map to Int followed by sum or
            // Collect with summingInt
        }

        System.out.println("Sum of digits: " + sumVal);
    }

    private static void threeMaxAndMin() {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        System.out.println("3 Min");
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("3 Max");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }

    private static void secondLargestInArray() {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer val  = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(val);
    }

    private static void print10EvenNumbers() {

        Stream.iterate(2, (Integer n) -> n+2).limit(10).forEach(System.out::println);

    }

    private static void freqOfCharInString() {
        String inputString = "Vijay Balakrishnan Venkatasubramanian";

        Map<Character, Long> charCountMap = inputString.chars().mapToObj(c -> (char) c)
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        charCountMap.forEach((character, freq) ->
                System.out.println("Character: " + character + " Frequency:" + freq));
    }

    private static void printMap(Map<Boolean, List<Integer>> mapToPrint) {
        mapToPrint.forEach((k, v) -> System.out.println("Key :" + k + "Value :" + v));
    }

    private static void printList(List<Integer> resultList) {
        resultList.forEach(System.out::println);
    }

    private static void printArray (int[] arrayToPrint) {
//        Arrays.stream(arrayToPrint).forEach(System.out::println);
        System.out.println(Arrays.toString(arrayToPrint));
    }

    private static void mergeAndSortArrays() {
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};

        int[] returnArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        printArray(returnArray);
    }


}
