package videoExercise;


import java.util.Scanner;

public class SumBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int remainder = 0;
        int[] sum  = new int[20];
        System.out.println("Input first binary number: ");
        int b1 = sc.nextInt();//  100010
        System.out.println("Input first binary number: ");
        int b2 = sc.nextInt(); // 110010

        while (b1!=0 || b2!=0){
            sum[i++] = ((b1%10 + b2%10 + remainder) %2);//1+1 = 2 % 2 = 0
            remainder = ((b1%10 + b2%10 + remainder)/ 2); // 1+1 = 2/2 = 1
            b1 = b1 / 10;
            b2 = b2 /10;
        }
        if(remainder !=0){
            sum[i++] = remainder; //SUM[6] = 1;
        }
        System.out.print("Binary: ");
        --i;
        while (i >= 0){
            System.out.print(sum[i--]);
        }


    }
}
