package test;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter number: ");
        int number = sc.nextInt(); // 5
        System.out.println(factorial(number));

    }

    public static int factorial(int n){
        if(n == 1)
            return 1;
        return n*factorial(n-1);
    }
}









