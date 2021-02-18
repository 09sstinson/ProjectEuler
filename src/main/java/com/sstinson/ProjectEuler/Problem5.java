package com.sstinson.ProjectEuler;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {

    //2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    //
    //What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    long solution;
    List<Integer> uniquePrimeFactors = new ArrayList<>();
    Problem5(){
        solveProblem5();
    }

    public static void main(String[] args){
        Problem5 p = new Problem5();
        System.out.println(p.solution);
    }

    public void solveProblem5(){


        List<Integer> nums = new ArrayList<>();
        List<Integer> endResult = new ArrayList<>();
        for(int i = 2; i <= 20; i++){
            nums.add(i);
            endResult.add(1);
        }

        int divisor = 2;
        while(!nums.equals(endResult)){
            List<Integer> temp = new ArrayList<>(nums);
            nums = divideAndReplace(nums, divisor);
            if(nums.equals(temp)){
                divisor++;
            }else{
                uniquePrimeFactors.add(divisor);
                divisor = 2;
            }
        }

        solution = multiplyAll(uniquePrimeFactors);
    }

    public List<Integer> divideAndReplace(List<Integer> nums, Integer divisor){
        List<Integer> temp = new ArrayList<>(nums);
        int index = 0;
        for(Integer num: nums){
            if(num % divisor == 0){
                temp.set(index, num / divisor);
            }
            index++;
        }
        return temp;
    }

    public long multiplyAll(List<Integer> nums){
        long product = 1;
        for(long num: nums){
            product*= num;
        }
        return product;
    }
}
