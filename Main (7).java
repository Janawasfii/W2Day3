package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//EX3
        /*int[] nums = {1, 4, 17, 7, 25, 3, 100};
        System.out.print("Enter the number of elements to find (k): ");
        int k = scanner.nextInt();
        int[] largest = findKLargestElements(nums, k);
        System.out.print("The " + k + " largest elements are: ");
        for (int num : largest) {
            System.out.print(num + " ");}*/
//EX4
        /*int[] numbers = {5, 4, 3, 2, 1};
        System.out.print("Original Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        reverse(numbers);
        System.out.print("\nReversed Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }}*/
//EX5
        /*System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search the element within array");
            System.out.println("4. Sort the array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    acceptElements(arr);
                    break;
                case 2:
                    displayElements(arr);
                    break;
                case 3:
                    searchElement(arr);
                    break;
                case 4:
                    sortArray(arr);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);}*/
 //EX6
      /*  System.out.print("Enter the minimum value of the range: ");
        int min= scanner.nextInt();
        System.out.print("Enter the maximum value of the range: ");
        int max = scanner.nextInt();
        System.out.print("Enter the number of random numbers to generate: ");
        int RandNum = scanner.nextInt();
        geneRandNum(min, max, RandNum);}*/

//EX7
        /*System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        int points = 0;
        points += checkLength(password);
        points += checkSpecialCharacters(password);
        points += checkUpperCaseLowerCase(password);
        String strength = classifyStrength(points);
        System.out.println("Password is " + strength + ".");}*/
//EX8
       /* System.out.print("Enter the number of Fibonacci terms to generate: ");
        int terms = scanner.nextInt();
        System.out.println("Fibonacci sequence with " + terms + " terms:");
        genFibo(terms);}*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//EX1
     /*String[] dic= {"cat","dog","red","is","am"};
        System.out.println("Original array: "+ Arrays.toString(dic));
        int lon = 0;
        for(String str:dic){
            if(str.length()>lon){
            lon = str.length();}}
        String[] lonStr = new String[dic.length];
        int c=0;
        for(String str: dic){
        if(str.length()==lon){
        lonStr[c++]= str;
        }}
        for(int i=0; i<c;i++){
                System.out.print("\""+lonStr[i]+ "\"");
            }}}*/
//EX2
       /* int[] numbers = {1, 1, 1, 3, 3, 5};
        System.out.print("Enter the element to check its occurrence: ");
        int Check = scanner.nextInt();
        int count = 0;
        for (int number : numbers) {
            if (number == Check) {
                count++;}}
        System.out.println(Check + " occurs " + count + " times");*/

        //EX3
   /* public static int[] findKLargestElements(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
        int maxIndex = i;
        for (int j = i + 1; j < n; j++) {
        if (nums[j] > nums[maxIndex]) {
        maxIndex = j;}}
        int temp = nums[i];
        nums[i] = nums[maxIndex];
        nums[maxIndex] = temp; }
        int[] largest = new int[k];
        System.arraycopy(nums, 0, largest, 0, k);
        return largest;*/
//EX4
       /* public static void reverse(int[] arr) {
            int n = arr.length;
            // Loop through half of the array
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
        }*/
//EX5
       /* public static void acceptElements ( int[] arr){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter elements of the array:");
            for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt(); }}
            public static void displayElements ( int[] arr){
            System.out.print("Elements of the array: ");
            for (int num : arr) {
            System.out.print(num + " "); }
            System.out.println();}
            public static void searchElement ( int[] arr){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the element to search: ");
            int element = scanner.nextInt();
            boolean found = false;
            for (int num : arr) {
            if (num == element) {
            found = true;
            break;}}
            System.out.println(found ? "Element found!" : "Element not found!");}
            public static void sortArray ( int[] arr){
            for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;}}}
            System.out.println("Array sorted!");
        }*/
//EX6
   /*   public static void geneRandNum(int min, int max, int RandNum) {
        Random random = new Random();
        System.out.println("Random numbers within the specified range:");
        for (int i = 0; i < RandNum; i++) {
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.print(randomNumber + " - ");
        }System.out.println();}}*/

//EX7
    /*public static int checkLength(String password) {
        int length = password.length();
        if (length <= 5) {
            return 0;
        } else if (length <= 7) {
            return 2;
        } else {
            return 3;}}
    public static int checkSpecialCharacters(String password) {
        boolean hasSpecialChar = password.matches(".*[!@#$%^&*()-+].*");
        return hasSpecialChar ? 2 : 0;}
    public static int checkUpperCaseLowerCase(String password) {
        boolean hasUpperCase = password.matches(".*[A-Z].*");
        boolean hasLowerCase = password.matches(".*[a-z].*");
        return hasUpperCase && hasLowerCase ? 3 : 0;}
    public static String classifyStrength(int totalScore) {
        if (totalScore >= 8) {
            return "strong";
        } else if (totalScore >= 5) {
            return "moderately strong";
        } else {
            return "weak";}}*/
//EX8
       /* public static void genFibo(int terms){
            int n1 = 0, n2 = 1, n3;
            for (int i = 1; i <= terms; i++) {
                System.out.print(n1 + " ");
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }}*/

















