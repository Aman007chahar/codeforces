package codeforces_questions_solve;
import java.util.Arrays;
import java.util.Scanner;

public class Drinks_200_B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[] = new int[n];
        double sum=0;

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
            sum=sum+arr[i];
        }
        System.out.print(sum/n);


    }
}
