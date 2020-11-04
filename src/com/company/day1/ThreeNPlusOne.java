package com.company.day1;

public class ThreeNPlusOne {



    public void maxCycleLengthBetweenOutput(int i, int j){
        System.out.println(i);
        System.out.println(j);
        System.out.println(maxCycleLengthBetween(i,j));
    }

    public int maxCycleLengthBetween(int i, int j){
        if (i>j) throw new RuntimeException("i must be less than j");
        int maxCycleLength = Integer.MIN_VALUE;
        for (int k=i;k<=j;k++){
            int lengthK = cycleLength(k);
            if (lengthK>maxCycleLength){
                maxCycleLength = lengthK;
            }
        }
        return maxCycleLength;
    }

    public int cycleLength(int number){
        int cycleLengthOfNumber = 1;
        while (number!=1){
            if (number%2==0){
                number = number / 2;

            } else {
                number = number * 3 + 1;
            }

            cycleLengthOfNumber++;
        }
        return cycleLengthOfNumber;
    }
}
