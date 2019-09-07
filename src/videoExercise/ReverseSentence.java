package videoExercise;

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the sentence: ");
        String s = sc.nextLine();
        char a;
        String m = "";
        for (int i = s.length()-1; i>=0; i--){
            a = s.charAt(i);
            m = m+a;
          //  System.out.println("Loop");
        }
        System.out.println("Original sentence: "+s);
        System.out.println("Reverse sentence:"+m);
    }
}
