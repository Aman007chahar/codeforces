package codeforces_questions_solve_sem_3;

import java.util.Scanner;

public class _1409_Yet_Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short t = scanner.nextShort();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a > b) {

                if ((a-b) %10==0) {
                    System.out.println((int) Math.ceil((a - b) / 10) );
                }else{
                    System.out.println((int) Math.ceil((a - b) / 10) + 1);
                }



            } else if (b > a) {

                if ((b-a) %10==0) {
                    System.out.println((int) Math.ceil((b - a) / 10) );
                }else{
                    System.out.println((int) Math.ceil((b - a) / 10) + 1);
                }


            } else {
                System.out.println((int) Math.ceil(b - a) / 10);
            }
        }
    }
}
