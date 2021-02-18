package com.sstinson.ProjectEuler;

public class Problem1 {
    //If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    //
    //Find the sum of all the multiples of 3 or 5 below 1000.

    public int solution;

    Problem1(){
        solveProblem1();
    }

    public static void main(String[] args){
        Problem1 p = new Problem1();
        System.out.println(p.solution);
    }

    public void solveProblem1(){
        int sum = 0;
        for(int i = 1; i < 1000 ; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        solution = sum;
    }


}
