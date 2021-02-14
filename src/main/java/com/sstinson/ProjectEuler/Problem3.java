package com.sstinson.ProjectEuler;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    //The prime factors of 13195 are 5, 7, 13 and 29.
    //
    //What is the largest prime factor of the number 600851475143 ?
    long number = 600851475143L;
    public long solution;
    Problem3(){

        solution = listPrimeFactors(number).get(listPrimeFactors(number).size()-1);
    }

    public static List<Long> listPrimeFactors(long n){
        long temp = n;
        List<Long> primeFactors = new ArrayList<>();
        while(findSmallestDivisor(temp) != temp){
            long i = findSmallestDivisor(temp);
            temp = temp/ i;
            primeFactors.add(i);
        }
        primeFactors.add(temp);
        return primeFactors;
    }

    public static long findSmallestDivisor(long n){
        // the smallest divisor of a number must be prime
        long i = 2;
        while( n % i != 0){
            i++;
        }
        return i;
    }

}
