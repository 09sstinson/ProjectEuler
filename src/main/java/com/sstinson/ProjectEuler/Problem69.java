package com.sstinson.ProjectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem69 {
    //Euler's Totient function, φ(n) [sometimes called the phi function], is used to determine the number of
    // numbers less than n which are relatively prime to n. For example, as 1, 2, 4, 5, 7, and 8, are all less
    // than nine and relatively prime to nine, φ(9)=6.
    //
    //n	Relatively Prime	φ(n)	n/φ(n)
    //2	1	1	2
    //3	1,2	2	1.5
    //4	1,3	2	2
    //5	1,2,3,4	4	1.25
    //6	1,5	2	3
    //7	1,2,3,4,5,6	6	1.1666...
    //8	1,3,5,7	4	2
    //9	1,2,4,5,7,8	6	1.5
    //10	1,3,7,9	4	2.5
    //It can be seen that n=6 produces a maximum n/φ(n) for n ≤ 10.
    //
    //Find the value of n ≤ 1,000,000 for which n/φ(n) is a maximum.


    public List<List<Long>> primeFactors;

    Problem69(){
        primeFactors = listAllPrimeFactors(1000000);
    }

    public static void main(String[] args) {
        Problem69 p = new Problem69();
        double max = 1;
        int totient = 0;
        int number = 0;

        // 510510 = 2*3*5*7*11*13*17
        int n = 510510;
        System.out.println((double) n/p.calculateEuler(n));

    }

    public int calculateEuler(int n){
        int i = n-2; // position of prime factorisation of n in primeFactors
        int totient = 0;
        for (int j = 0; j < i; j++) {
            if (Collections.disjoint(primeFactors.get(i), primeFactors.get(j))) {
                totient++;
            }
        }
        // add one because 1 is always relatively prime
        return totient + 1;
    }



    public List<List<Long>> listAllPrimeFactors(int n){
        List<List<Long>> primeFactors = new ArrayList<>();
        for(int i = 2; i <= n; i++ ){
            primeFactors.add(Problem3.listPrimeFactors(i));
        }
        return primeFactors;
    }



}
