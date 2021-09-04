package com.learndsa;

public class Arrays {

    public static void main(String[] args) {

        int[] testArrayNotSorted = new int[]{4,3,55,6,77,3,22,90,0,-4,21};
        int[] testArraySorted = new int[]{10,20,30,40,50,60,70,80};
        // System.out.println(linearSearch(testArraySorted, 40));
        // System.out.println(binarySearch(testArraySorted, 50));
        System.out.println("The sorted array is");
        //bubbleSort(testArrayNotSorted);
//        selectionSort(testArrayNotSorted);
        printArray(testArrayNotSorted);



    } // end of main

    // print array for testing reasons
    public static void printArray(int[] arr){
        for(int x: arr){
            System.out.print(x + " ");
        }
    }

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

    // bubble sort : compare adjacent items
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    // selection sort
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j = i+1; j<arr.length-1; j++){
                if(arr[j] < arr[min]) min = j;
            }
//            after each round we find the minimum in that array range
//            now swap the two values
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] =  temp;
        }
    }



} // end of class
