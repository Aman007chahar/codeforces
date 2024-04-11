package cp;

import java.util.Scanner;

public class Problem734B {
    public static void main(String[] args) {
        Scanner scanner  =new Scanner(System.in);
        int result = 0;
        int K2 = scanner.nextInt();
        int K3 = scanner.nextInt();
        int K5 = scanner.nextInt();
        int K6 = scanner.nextInt();

        while(K2 > 0  && K5 > 0 && K6 > 0){
            result = result + 256;
            K2--;
            K5--;
            K6--;

        }
        while(K3>0 && K2 > 0){
            result = result+32;
            K2--;
            K3--;
        }
        System.out.println(result);
    }
}
