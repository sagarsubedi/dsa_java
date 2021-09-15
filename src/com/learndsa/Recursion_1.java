package com.learndsa;

public class Recursion_1 {
    public static void main(String[] args) {

//        printDecInc(5);
//        printSkip(5);
//        System.out.println(nthFibTerm(5));
//        System.out.println(nRaisedToX(2,5));
        int[] arr = {3,45,2,34,5,7,3,12,1,3,45,5};
//        System.out.println(isSorted(new int[]{1,2,3,99,5},0));
//        System.out.println(findIndex(arr, 0, 3));
//        System.out.println(findLastIndex(arr, 0, 45));
//        pattern(5,1,1);
//         bubbleSort(arr, 0, arr.length-1);


    }

//    for testing purposes
    public static void printArray(int[] arr){
        for (int x: arr) {
            System.out.print(x+" ");
        }
    }

//    print 5 4 3 2 1 1 2 3 4 5
    public static void printDecInc(int n){
        if(n== 0) return;

        System.out.println(n);
        printDecInc(n-1);
        System.out.println(n);
    }

//    print 5 3 1 2 4
    public static void printSkip(int n){
        if(n==0) return;

        if(n%2 == 1) System.out.println(n);
        printSkip(n-1);
        if(n%2 == 0) System.out.println(n);
    }

//    find n factorial
    public static int findFactorial(int n){
        return (n==1) ? 1 : (n*findFactorial(n-1));
    }

//    find nth fibonacci term
    public static int nthFibTerm(int n){
        return (n==0 || n==1) ? n : nthFibTerm(n-1) + nthFibTerm(n-2);
    }

//    raise n to power of x
    public static int nRaisedToX(int n, int pow){
        if(pow==0) return 1;
        if(pow==1) return n;
        return (n*nRaisedToX(n, pow-1));
    }

//    check if the array is sorted or not
    public static boolean isSorted(int[] arr, int startIndex){
        if(startIndex == arr.length-1) return true;
        return (arr[startIndex] > arr[startIndex+1]) ? false : isSorted(arr, startIndex+1);
//        return arr[startIndex] <= arr[startIndex + 1] && isSorted(arr, startIndex + 1);
    }

//    find the index where the element first appears and -1 if not present
    public static int findIndex(int[] arr, int startIndex,  int target){
        if(startIndex > arr.length-1) return -1;
        return arr[startIndex] == target ? startIndex : findIndex(arr, startIndex+1, target);
    }

//    find the index where the element last appears and -1 if not present. have to start from 0 index for searching
    public static int findLastIndex(int[] arr, int startIndex, int target){
        if(startIndex == arr.length) return -1;
        int index = findLastIndex(arr, startIndex+1, target);
        if(index == -1){
            if(arr[startIndex] == target){
                return startIndex;
            }else{
                return -1;
            }
        }else{
            return index;
        }
    }

//    print a pattern using recursion, no loop
    public static void pattern(int n, int row, int col){
        if(row > n) return;
        if(col>row){
            System.out.println();
            pattern(n,row+1, 1);
            return;
        }
        System.out.print("* ");
        pattern(n, row, col+1);
    }

//    bubble sort using recursion
    public static void bubbleSort(int[] arr, int startIndex, int lastIndex){

        if(lastIndex==0) return;

        if(startIndex == lastIndex) {
            bubbleSort(arr,0,lastIndex-1);
            return;
        }
        if(arr[startIndex] > arr[startIndex+1]) {
            int temp = arr[startIndex];
            arr[startIndex] = arr[startIndex+1];
            arr[startIndex+1] = temp;
        }
        bubbleSort(arr, startIndex+1, lastIndex);
    }


}
