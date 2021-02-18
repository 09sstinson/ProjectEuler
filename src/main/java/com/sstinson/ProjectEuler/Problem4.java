package com.sstinson.ProjectEuler;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Problem4 {
//A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.
    int solution;
    Problem4(){
        solveProblem4();
    }

    public static void main(String[] args){
        Problem4 p = new Problem4();
        System.out.println(p.solution);
    }

    public void solveProblem4(){
        List<Integer> products = new ArrayList<>(1000000);

        for( int i = 100; i < 1000; i++){
            for(int j = 100; j < 1000; j++){
                products.add(i*j);
            }
        }
        Collections.sort(products, Collections.reverseOrder());
        int index = 0;
        while(!isPalindrome(products.get(index))){
            index++;
        }
        solution = products.get(index);
    }

    public boolean isPalindrome(int n){
        // Return true if n is a palindrome
        String nString = String.valueOf(n);
        int leftIndex = 0;
        int rightIndex = nString.length()-1;
        while(leftIndex < rightIndex){
            char left = nString.charAt(leftIndex);
            char right = nString.charAt(rightIndex);
            if(left != right){
                return false;
            }
            leftIndex +=1;
            rightIndex -=1;
        }

        return true;
    }
}
