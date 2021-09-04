package com.learndsa;

public class Arrays_1D {

    public static void main(String[] args) {

        int[] testArrayNotSorted = new int[]{4,3,55,6,77,3,22,90,0,-4,21};
        int[] testArraySorted = new int[]{10,20,30,40,50,60,70,80};
//        System.out.println(linearSearch(testArraySorted, 40));
//        System.out.println(binarySearch(testArraySorted, 50));
//        System.out.println("The sorted array is");
//        bubbleSort(testArrayNotSorted);
//        selectionSort(testArrayNotSorted);
//        insertionSort(testArrayNotSorted);
//        printArray(testArrayNotSorted);
        int[] testArrayUpLowBound = new int[]{1,1,2,2,2,3,3,3,4,5,6,7};
        System.out.println(lowerBound(testArrayUpLowBound, 3));
        System.out.println(upperBound(testArrayUpLowBound,2));



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


    // insertion sort
    public static void insertionSort(int[] arr){
        for(int i=1; i<=arr.length-1; i++){
            int val = arr[i];
            int j= i - 1;
            while (j>=0 && arr[j] > val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
    }

    // find upper bound and lower bound in sorted array
    // lower bound: the lowest index which contains that item
    // upper bound: the highest index which contains that item
    public static int lowerBound(int[] arr, int data){
        int ans=-1, low=0, high=arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
//            if the mid index points to data look only to the left for lowerBound
            if(arr[mid] == data) {
                ans = mid;
//                being the high to the left half of the array
                high = mid - 1;
//               if mid is not the data then check if data < arr[mid] so that we only look
//                on the left half of array
            }else if(data < arr[mid]){
                high = mid - 1;
//                if none, then bring the low to the other half because the element is is other half
            }else{
                low = mid + 1;
            }
        }


        return ans;
    }

    public static int upperBound(int[] arr, int data){
        int ans=-1, low=0, high=arr.length-1;

        while(low <= high){
            int mid = (high+low) / 2;
            if(arr[mid] == data){
                ans = mid;
//                in this case, look for higher upper bound to the right
                low = mid + 1;
//                if data is smaller, then look on the left part of array
            }else if(data < arr[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return ans;
    }


} // end of class
