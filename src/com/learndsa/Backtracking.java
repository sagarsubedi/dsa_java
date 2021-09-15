package com.learndsa;

public class Backtracking {
//    explore possibilities while backtracking, undo changes and explore until answer is found

    public static void main(String[] args) {
//        queenPermutation(new boolean[4], 0, 2, "");
//        queenPermutation(new boolean[5], 0, 3, "");
        queenCombination(new boolean[4], 0,2,"", -1);
    }

//    given 4 boxes, arrange 2 queens nPr (arrange r elements in n places)
    public static void queenPermutation(boolean[] board, int queensSoFar, int totalQueens, String ans){
        if(queensSoFar==totalQueens) {
            System.out.println(ans);
        }
        for (int i = 0; i < board.length; i++) {
            if(!board[i]) {
                board[i] = true;
                queenPermutation(board, queensSoFar + 1, totalQueens, ans + "q" + queensSoFar + "b" + i + " ");
                board[i] = false; // undo changes
            }
        }
    }

//    Queen combination 4 boxes 2 queens
    public static void queenCombination(boolean[] board, int queensSoFar, int totalQueens, String ans, int lastBoxUsed){
        if(queensSoFar==totalQueens) {
            System.out.println(ans);
        }
        for (int i = lastBoxUsed+1; i < board.length; i++) {
            board[i] = true;
            queenCombination(board, queensSoFar + 1, totalQueens, ans + "q" + queensSoFar + "b" + i + " ", i);
            board[i] = false; // undo changes
        }
    }
}
