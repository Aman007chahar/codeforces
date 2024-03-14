package random_questions;

import java.util.Scanner;

public class _1213_B_Bad_Prices_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();

        while(iterations-->0){
            int noOfDays = scanner.nextInt();
            int arr[] = new int[noOfDays];

            for (int i = 0; i < noOfDays; i++) {
                arr[i] = scanner.nextInt();
            }
            int countOfBadDays = 0;
            int min = arr[noOfDays-1];
            for(int i = noOfDays-2 ; i>=0 ; i--){
                if(arr[i]>min){
                    countOfBadDays++;
                }
                min = Math.min(arr[i],min);
            }
            System.out.println(countOfBadDays);
        }
    }
}
