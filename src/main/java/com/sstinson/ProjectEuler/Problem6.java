package com.sstinson.ProjectEuler;

public class Problem6 {
    //The sum of the squares of the first ten natural numbers is,
    //
    //The square of the sum of the first ten natural numbers is,
    //
    //Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
    //
    //Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

    int solution;
    Problem6(){
        solveProblem6();
    }

    public void solveProblem6(){
        int sum = 0;
        int squareSum = 0;
        for(int i = 1; i <=100; i++){
            sum += i;
            squareSum += i*i;
        }

        solution = sum*sum - squareSum;
    }
}
