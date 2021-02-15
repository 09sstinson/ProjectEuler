package com.sstinson.ProjectEuler;


import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class Problem7 {

    // By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
    //
    //What is the 10 001st prime number?
    List<Integer> primes = new ArrayList<>();
    int solution;

    Problem7(){
        primes = listNPrimes(10001);
        solution = primes.get(primes.size() - 1);
    }

    public List<Integer> listNPrimes(int n){
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int i = 2;
        while( count < n){
            if(checkPrime(i)){
                count++;
                primes.add(i);
            }
            i++;
        }
        return primes;
    }

    public boolean checkPrime(int n){

        for(int i = 2; i <= Math.sqrt(n); i++ ){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
