package pl.globallogic.lessons.lesson8;

import java.util.Arrays;

public class CandyShop {
    public static void main(String[] args) {
        int[] candyPrices = {3,4,1,2,10,5,6,1};
        int money = 10;
        sortCandyPrices(candyPrices);
        System.out.printf("Sorted candy prices: '%s' \n", Arrays.toString(candyPrices));
        System.out.printf("Number of candies which can be bought for $ '%s': '%s' \n",
                money, findNumberOfCandies(candyPrices, money));
    }
    private static int findNumberOfCandies(int[] candyPrices, int money) {
        int numberOfCandies = 0;
        int moneySpent = money;
        for (int i = 0; i < candyPrices.length; i++) {
            if(moneySpent >= candyPrices[i]) {
                numberOfCandies++;
                moneySpent -= candyPrices[i];
            }
        }
        return numberOfCandies;
    }
    private static void sortCandyPrices(int[] candyPrices) {
        for (int i = 0; i < candyPrices.length - 1; i++) {
            for (int j = 0; j < candyPrices.length - i - 1; j++) {
                if (candyPrices[j] > candyPrices[j + 1]) {
                    int temp = candyPrices[j];
                    candyPrices[j] = candyPrices[j+1];
                    candyPrices[j+1] = temp;
                }
            }
        }
    }

}


