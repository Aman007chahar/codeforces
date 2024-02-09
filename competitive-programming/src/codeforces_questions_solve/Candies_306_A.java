package codeforces_questions_solve;

import java.util.Scanner;

public class Candies_306_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int m=scanner.nextInt();//m=total friends
        int n=scanner.nextInt();//n=total candies

        int array[] = new int[m];//unused

//here we have checked if the candies can be equally distributed or not
        if(m%n==0){
            int count = m/n;
            for(int i=0;i<count;i++){
                System.out.println(count);
                //case1: equal no of candies to each friend
            }
        }else{
            //1.count gives the candies with less amount
            //2.remainder tells about candies left to distribute to maximize their share
            int count=m/n;
            int remainder=m%n;


            //case 2.1 when more friends are getting the most candies
            if(count>=remainder){
                for(int i=0;i<=count-remainder;i++){
                    System.out.println(count);

                }
                for(int j=0;j<remainder;j++){
                    System.out.println(count+1);
                }


            //case 2.2   when less friends are getting more candies
            }else{
                for(int i=0;i<=remainder-count;i++){
                    System.out.println(count);

                }
                for(int j=0;j<remainder;j++){
                    System.out.println(count+1);
                }
            }


        }
    }
}
