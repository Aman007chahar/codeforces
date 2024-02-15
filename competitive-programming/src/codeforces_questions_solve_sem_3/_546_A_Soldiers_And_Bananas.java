package codeforces_questions_solve_sem_3;
import java.util.Scanner;
public class _546_A_Soldiers_And_Bananas {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                short costOfBanana = scanner.nextShort();
                long initialDollars = scanner.nextLong();
                short noOfBananas = scanner.nextShort();
                long ans = (noOfBananas * costOfBanana + noOfBananas*noOfBananas*costOfBanana)/2 - initialDollars;

                if(ans <1 ){
                    System.out.println("0");
                }else {

                    System.out.println(ans);
                }
    }
}
