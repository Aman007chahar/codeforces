package codeforces_mycode;

import java.util.Scanner;

public class Dalton_the_Teacher_1855_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while(testCases-- > 0){

            int n = scanner.nextInt();
            int seats[] = new int[n+1];

            for(int i=1;i<=n;i++){
                seats[i] = scanner.nextInt();
            }
            double count=0;
            for(int i=1;i<=n;i++){
                if(seats[i]==i){
                    count++;
                }
            }
            System.out.println((int)Math.ceil(count/2));
        }

    }
}
