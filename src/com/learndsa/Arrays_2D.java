package com.learndsa;

import java.util.Arrays;

public class Arrays_2D {

    public static void main(String[] args) {
//        in the heap, there will be [rows] memory address that contains address of [column] addresses of array
//        for each [row] address
//        4K+{x ranges from 0 to (row-1)} points to 14K+{x ranges from 0 to (column-1)}
//            int[][] arr = new int[3][];

//        Q: given a 2d array {11,12,13,14} , {21,22,23,24}, {31,32,33,34}, {41,42,43,44}, print the rows in a wave patter
//        11-12-13-14-24-23-22-21-31-32-33-34-44-43-42-41
        int[][] arr ={{11,12,13,14,15} ,{21,22,23,24,25}, {31,32,33,34,35}, {41,42,43,44,45}, {51,52,53,54,55}};
//        boolean isEven;
//        for (int i=0; i<arr.length; i++){
//            isEven = i%2==0;
//            for(int j=(isEven ? 0 : arr[i].length-1); (isEven ? j<arr.length : j>=0); j=(isEven ? j+1 : j-1)){
//                System.out.print(arr[i][j]+" ");
//            }
//        }

//        Q: print 2d array in spiral form: 11 12 13 14 15 25 35 45 55 54 53 52 51 41 31 21 22 23 24 34 44 43 42 32 33
//         we will use 6 pointers. array should be square array (n*n). works with any n*n array
        int top = 0, left = 0, right = arr.length-1, bottom = arr.length-1, dir=1;
        while(left <= right && top <= bottom){
                if(dir == 1){
                    for(int i=left; i<=right; i++){
//                        printing from row[0] right to left
                        System.out.print(arr[top][i]+ " ");
                    }
                    dir++;
                    top++;
                }else if(dir==2){
//                    printing from right to bottom
                    for (int i=top; i<=bottom; i++){
                        System.out.print(arr[i][right]+ " ");
                    }
                    dir++;
                    right--;
                }else if(dir==3){
//                    printing from bottom right to left
                    for(int i=right; i>=left; i--){
                        System.out.print(arr[bottom][i]+ " ");
                    }
                    dir++;
                    bottom--;
                }else if(dir==4){
                    for(int i=bottom; i>=top; i--){
                        System.out.print(arr[i][left]+ " ");
                    }
                    dir = 1;
                    left++;
                } // end of if else
             // end of count == 0 ?
        } // end of parent while

    }
}
