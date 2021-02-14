package com.sstinson.ProjectEuler;

public class Problem2 {
    //Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
    //
    //1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    //
    //By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

    int solution;

    Problem2(){
        solveProblem2();
    }

    public void solveProblem2(){
        int currentFib = 2;
        int previousFib = 1;
        int sum = 0;

        while(currentFib <= 4000000){
            if(currentFib % 2 == 0){
                sum += currentFib;
            }
            int temp = currentFib + previousFib;
            previousFib = currentFib;
            currentFib = temp;
        }
        solution = sum;

    }
}
