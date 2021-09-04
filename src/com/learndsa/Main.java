package com.learndsa;

public class Main {

    public static void main(String[] args) {

        int[] testArray = new int[]{10,20,30,40,50,60,70,80};
        // System.out.println(linearSearch(testArray, 40));
        // System.out.println(binarySearch(testArray, 50));



    } // end of main

    // return index after a linear search
    public static int linearSearch(int[] arr, int item){
        int ind = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == item) {ind = i; break;}
        }
        return ind;
    }

    // binary search. needs sorted array
    public static int binarySearch(int[] arr, int item){
        int low=0, high=arr.length-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] < item) low = mid + 1;
            else if(arr[mid] > item) high = mid - 1;
            else {return mid;}
        }

        return -1;
    }


} // end of class
