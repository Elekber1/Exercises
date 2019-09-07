package videoExercise;

import java.util.Scanner;

public class sumTwo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Result: "+sumDigits(n));
    }

    public static int sumDigits( int n){
        int sum = 0;
        while(n !=0){
          sum+=n%10;// 12
          n =  n/10;
        }

        return sum;
    }
}
