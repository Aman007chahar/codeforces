package codeforces_questions_solve_sem_3;

import java.util.Scanner;

public class _50_A_Domino_piling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        byte m= scanner.nextByte();
        byte n= scanner.nextByte();

        if(m%2==0||n%2==0){
            System.out.println((m*n)/2);
        }else{

            System.out.println((int)Math.floor((m*n)/2));
        }


    }
}
